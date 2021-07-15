package fundamentos;

public class Temperatura {        // (F° - 32) * 5/9 = C°  - formula para transformar Fahrenheit em Celsius
	public static void main(String[] args) {
		double f = 86;
		final int Te = 32;
		final double Tm = 5.0/9;
		double c = (f - Te) * Tm;
		
		System.out.println("A temperatura inserida em Farenheit e convertida em Celsius é: " + c +"°");
		
		f = 37;
		c = (f - Te) * Tm;
		
		System.out.println("A temperatura inserida em Farenheit e convertida em Celsius é: " + c +"°");
		
	}

}
