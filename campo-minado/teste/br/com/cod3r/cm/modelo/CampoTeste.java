package br.com.cod3r.cm.modelo;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;  // ou coloca * depois do ponto do Assert pra puxar tudo

import static org.junit.jupiter.api.Assertions.*;  // o * significa que puxa tanto o true como o false

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	
	private Campo campo;
	
	@BeforeEach           // significa que pra cada método irá chamar esta função
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {           // vizinho da esquerda
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);                       // espera um resultado true ou verdadeiro
				
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {               // vizinho da direita
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);                           // espera um resultado true ou verdadeiro
		
	}
		
	
	@Test
	void testeVizinhoDistancia1EmCima() {          // vizinho de cima
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);                     // espera um resultado true ou verdadeiro
		
	}
	
	@Test
	void testeVizinhoDistancia1EmBaixo() {          // vizinho de baixo
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);                  // espera um resultado true ou verdadeiro
		
	}
	
	@Test
	void testeVizinhoDistancia2() {          // vizinho diagonal
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);                // espera um resultado true ou verdadeiro
		
	}
	
	@Test
	void testeNaoVizinho() {          // esse não é vizinho 
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);             // espera um resultado false ou falso...por isso o teste foi correto
		
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
		
	}
	
	@Test
	void testeAlternarMarcacaoDuasCamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
		
	}
	

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
		
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
		
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
		
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
		 campo.abrir();
		
	   });
		
    }
	
	@Test
	void testeAbrirComVizinhos1() {
		
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();	
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
		
	}
	
	@Test
	void testeAbrirComVizinhos2() {                       //criar um campo minado como vizinho do campo22
		
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);                 // não entendi ambos oos campos na mesma posição      
		campo12.minar();
		
		                                                      // como minamos um campo a propagação de abertura de campos não pode prosseguir
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();	
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
		
	}
}
