package oo.heranca.desafio;

//A classe pai n�o tem mais o construtor padr�o pois foi alterado, agora precisa definir um construtor, esta dando erro

public class Corolla extends Carro {
	
	public Corolla(){          //defini um construtor    -- ele foi colocado como public para poder ser enxergado por todos ja que metodo main foi para outro pacote e s� assim ser� visivel em outros pacotes
		super(212);     //estabeleci por padr�o a velocidade m�xima de 212  pode usar o super ou o this
	}
	
	

}
