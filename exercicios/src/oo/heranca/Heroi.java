package oo.heranca;

public class Heroi extends Jogador {
	
	//sobrescrevendo o método atacar original para que o ataque do Heroi seja mais forte 
	// posso simplesmente copiar o metodo e colar aqui e alterar o valor das vidas que serão perdidas no ataque
	
/*	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);                 //o abs retorna valor absoluto, ou seja se o resultado for -1 ele retornara 1
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;                //alterei o valor original das vidas perdidas de 10 para 20
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -=20;                //alterei o valor original das vidas perdidas de 10 para 20
			return true;
		} else {
			return false;
		}
		
	}
	
	*/
	
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);                       //super ta chamando o método da superclasse, chamou o método pai
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
}
