package oo.heranca.desafio;

//A classe pai não tem mais o construtor padrão pois foi alterado, agora precisa definir um construtor, esta dando erro

public class Corolla extends Carro {
	
	public Corolla(){          //defini um construtor    -- ele foi colocado como public para poder ser enxergado por todos ja que metodo main foi para outro pacote e só assim será visivel em outros pacotes
		super(212);     //estabeleci por padrão a velocidade máxima de 212  pode usar o super ou o this
	}
	
	

}
