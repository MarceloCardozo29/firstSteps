package lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		// OLHA O POLIMORFISMO AEW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Calculo multiplicacao = new Multiplicar();   // pode ser assim
		calculo = new Multiplicar();                  // ou pode ser assim
		System.out.println(calculo.executar(2, 3));
		
	/* ESSAS AÍ ENCIMA SERIAM AS FORMAS TRADICIONAIS
	 * AGORA AS LAMBDAS ESTÃO NO CALCULOTESTE2********************* */	
	 
		
		
		
		
	}

}
