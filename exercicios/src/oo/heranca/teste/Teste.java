package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Corolla;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
	// ESSE FOI O QUE EU FIZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ	
		
	/*	Corolla corolla = new Corolla();
		
		System.out.println(corolla.velocidadeAtual);
		corolla.acelerar();
		//corolla.acelerar();
		corolla.acelerar();
		System.out.println(corolla.velocidadeAtual);
		corolla.acelerar();
		
		
		System.out.println(corolla.velocidadeAtual);
		
		//corolla.acelerar();
				
		System.out.println(corolla.velocidadeAtual);
		
		corolla.frear();
		corolla.frear();
		System.out.println(corolla.velocidadeAtual);
		corolla.frear();
		
		corolla.frear();
		System.out.println(corolla.velocidadeAtual);
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		
		System.out.println(corolla.velocidadeAtual);
		
		corolla.frear();
		corolla.frear();
		corolla.frear();
		System.out.println(corolla.velocidadeAtual);
		
		
		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();          //teste pra saber se a aceleração específica da Ferrari funciona ja que era de 15 em 15
		
		System.out.println(ferrari.velocidadeAtual);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();          //teste pra saber se a aceleração específica da Ferrari funciona ja que era de 15 em 15
		
		System.out.println(ferrari.velocidadeAtual);
		
		
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println(ferrari.velocidadeAtual);
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println(ferrari.velocidadeAtual);
		
		
		
	} ESSE FOI O QUE EU FIZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ
*/
		// aqui chamou o tipo mais generico Carro
		Carro c1 = new Corolla();     // ou Corolla c1 = new Corolla();  assim chama o tipo mais especifico
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		Ferrari c2 = new Ferrari(400);  //alterei Carro para Ferrari para poder conseguir ligar o Turbo, ja que carro não tem o Turbo, só a Ferrari
		c2.ligarTurbo();
		c2.ligarAr();      // o fator de aceleração vai alterar conforme as coisas que estiverem ligadas ou desligadas
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		
	}		
		
}
	
