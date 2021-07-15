package classe;

public class PrimeiroTrauma {
	
	int a = 3;                                               // atributo que pertence a instancia
	
	public static void main(String[] args) {                  //método static pertencce a classe - so consigo imprimi  o atributo de instancia se criar uma instancia
		
		PrimeiroTrauma p = new PrimeiroTrauma();              // instancia
		
		System.out.println(p.a);
	}

}
