package oo.heranca.desafio;

public class Carro {
	
	// velocidade atual, metodo acelerar e metodo frear
/* ESSE FOI O JEITO QUE EU FIZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ	
	int velocidadeAtual = 300;
	int velocidadeZero = 0;
	int velocidadeMaxima = 200;
	
		
	void acelerar() {                                     //criou metodo acelerar
		  if(velocidadeAtual >= 200) {                     //s
			  velocidadeAtual = velocidadeMaxima;
		  } else {
			  velocidadeAtual +=5;
			  
		  }
	 }
	
	void frear() {
		if(velocidadeAtual <= 0) {
			velocidadeAtual = velocidadeZero;
			} else {                                     //criou metodo acelerar
				  velocidadeAtual -=5;  
			 } 
		
	 }
 ESSE FOI O JEITO QUE EU FIZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ*/

	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;         // protected transmitir por herança
	private int delta = 5;               // protected transmitir por herança ---  agora o fator de aceleração deixou de ser o valor e passou a ser o atributo delta
	
	
	protected Carro(int velocidadeMaxima){            //construtor carro com um atributo ------ protected transmitir por herança
		VELOCIDADE_MAXIMA =velocidadeMaxima;
	}
	
	
	public void acelerar(){                                // public pois o metodo main agora passsou para outro pacote
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
			
	}
	 public void frear() {                   // public pois o metodo main agora passsou para outro pacote
		 if(velocidadeAtual>= 5) {           // se a velocidade for maior ou igual a 5, tira 5, senão velocidade atual 0
			 velocidadeAtual -=5;
		 } else {
			 velocidadeAtual = 0;
		 }
	
	}
	
	public String toString() {                                   // metodo pra poder imprimir
		return "Velocidade atual é " + velocidadeAtual;
	}


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
	
	
}


