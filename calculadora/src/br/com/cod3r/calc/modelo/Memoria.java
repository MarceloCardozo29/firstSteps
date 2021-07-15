package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, SINAL, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
		
	};
	
	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
		
	private Memoria() {
		
		
	}
		
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
		
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;     //se tiver vazio, mostra o valor zero, senão mostra o valor digitado
	}
	
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);             //CTRL + 1 CRIAR MÉTODO
		
		if(tipoComando == null) {
			return;
		}else if (tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		}else if (tipoComando == TipoComando.SINAL && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}else if (tipoComando == TipoComando.SINAL && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
			
			
		}else if (tipoComando == TipoComando.NUMERO|| tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
		}else {
			substituir = true;
			textoAtual = obterResultadoOperaçao();              // CTRL + 1 === CRIOU O MÉTODO
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
			
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));	
		
	}


	private String obterResultadoOperaçao() {
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		} else if (ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		} else if (ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		} else if (ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual; 
		}
		
		String texto = Double.toString(resultado).replace(".", ",");        // SE O FINAL DO RESULTADO TERMINAR EM ,0 VAI PASSAR A MOSTRAR O NÚMERO INTEIRO, SEM VIRGULA E ZEO
		boolean inteiro = texto.endsWith(",0");
		return inteiro ? texto.replace(",0", "") : texto;
	}


	private TipoComando detectarTipoComando(String texto) {   // SE NÃO TIVER NADA NA TELA E DIGITAR 0 (ZERO) A TELA PERMANECE VAZIA//PRA NÃO APARECER AQUELES ZEROS A ESQUERDA
		if(textoAtual.isEmpty() && texto == "0") {
		return null;
		}
		
		//VERIFICAR SE O TEXTO DIGITADO PODE OU NÃO SER CONVERTIDO PARA UM VALOR INTEIRO
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			//QUANDO NÃO FOR NÚMERO...
			if("AC".equals(texto)) {                   // SE DIGITADO AC, RECEBE VALOR VAZIO, CASO CONTRARIO RECEBE O VALOR DIGITADO //AC LIMPA A TELA DA CALCULADORA
				return TipoComando.ZERAR;
			} else if ("/".equals(texto)) {
				return TipoComando.DIV;
						
			}else if ("*".equals(texto)) {
				return TipoComando.MULT;
						
			}else if ("-".equals(texto)) {
				return TipoComando.SUB;
						
			}else if ("+".equals(texto)) {
				return TipoComando.SOMA;
						
			}else if ("=".equals(texto)) {
				return TipoComando.IGUAL;
				
			}else if ("±".equals(texto)) {
				return TipoComando.SINAL;
						
						
			}else if (",".equals(texto) && !textoAtual.contains(",")) {   // PRA INSERIR APENAS UMA VÍRGULA
				return TipoComando.VIRGULA;
						
			}
			
						
		}
	
		
		return null;
	}
	
	

}
