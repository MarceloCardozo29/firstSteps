package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	private void executarJogo() {
		
		try {
			boolean continuar = true;
			while(continuar) {
				cicloDoJogo();
				
				
				System.out.println("Outra partida? (S/n) ");           // resposta padrão S (MAIÚSCULA) ou n (minúsucula)
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
				
			}
			
			
		} catch(SairException e) {
			System.out.println("  Tchauuuuuu!!!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcansado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");      // pegou o valor da coordenada
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();        // pegou o valor da coordenada e transformou em inteiro    // .trim tira os espaços em branco
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");        //vai fazer de acordo com o valor digitado
				
				if("1".equalsIgnoreCase(digitado)) {              //se 1
					tabuleiro.abrir(xy.next(), xy.next());
				} else if("2".equalsIgnoreCase(digitado)) {        // se 2
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
					
			}
			
			System.out.println(tabuleiro);
			System.out.println(" Você ganhou!!! ");
		}catch(ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println(" Você perdeu!!! ");
		}
			
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {              //lança uma exceção para finalizar e sair do jogo
			throw new SairException();
		}
		 return digitado;
	}
}
