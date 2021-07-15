package oo.polimorfismo;

public class Comida {
	                          // polimorfismo dinamico, criamos herança para herdarem os metodos
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {          
		if(peso >= 0) {                         //não permitir o valor de peso ser negativo  
		this.peso = peso;
		}
	}


}
