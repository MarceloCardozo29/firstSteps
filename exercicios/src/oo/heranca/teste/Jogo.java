package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();  // foi criado a classe Monstro, e aqui substituido o jogador  pelo Monstro, antes estav assim  Jogador j1 = new Jogador();
		monstro.x = 10;      // 10 ou  11 é a posição do jogador na tabela
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);  // foi criado a classe Heroi, e aqui substituido o jogador  pelo Heroi, antes estav assim  Jogador j2 = new Jogador();
		// heroi foi criado de modo diferente do Monstro logo acima
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		monstro.andar(Direcao.NORTE);   //saiu do alcance dos ataques
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		
	}

}





