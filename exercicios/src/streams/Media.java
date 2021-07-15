package streams;

public class Media {
	
	private double total;
	private int quantidade;
	
	public Media adicionar (double valor) {
		total += valor; // quando adicionar, estarei acrescentando tanto ao valor total quanto em quantidade
		quantidade++;
		return this;
		
	}
	
	public double getValor() {
		return total / quantidade;
	
	}
	
	public static Media combinar(Media m1, Media m2) {                     //função combinar
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;                  // somou o total de m1 mais o total de m2
		resultante.quantidade = m1.quantidade + m2.quantidade;    // somou a quantidade de m1 mais a quantidade de m2
		return resultante;
	}
}

