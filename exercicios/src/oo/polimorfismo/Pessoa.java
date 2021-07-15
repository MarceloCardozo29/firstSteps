package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	                                       //POLIMORFISMO ESTATICO, SOBRECARGA DE METODO, IMPLEMENTAÇÕES DIFERENTES COM METODOS DIFERENTTES SOBRECARREGOU O METODO COMER
	public void comer(Comida comida) {    // tinha o metodo comer arroz, o feijao e o sorvete e foi substituido pelo comida
		this.peso += comida.getPeso();
	}
	
	/*public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXPASSARAM A NÃO PRECISAR MAIS DESSES METODOS
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
*/
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {          
		if(peso >= 0) {                         //não permitir o valor de peso ser negativo  
		this.peso = peso;
		}
	}

}
