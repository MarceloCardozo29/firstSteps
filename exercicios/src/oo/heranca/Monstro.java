package oo.heranca;

public class Monstro extends Jogador{
	
	public Monstro(){
		this(0, 0);
	}                       // PUBLIC PARA SER VISTO PELO METODO MAIN QUE MUDOU PARA OUTRO PACOTE
	
	public Monstro(int x, int y){
		super(x, y);
	}
	

}
