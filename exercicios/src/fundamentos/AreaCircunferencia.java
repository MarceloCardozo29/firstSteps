package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {               // main + ctrl + espaço
		double raio = 3.4;     //variável real recebe valor 3.4
		final double Pi = 3.14159;      // final - o valor é constante não mudará -- virou uma constante e por convenção o nome é maiúsculo
		
		double area = Pi * raio * raio;
		
		System.out.println(area);                          //syso + ctrl + espaço
		
		
		raio = 10;
		area = Pi * raio * raio;
		System.out.println("Área: " + area + "m2");
	}

}

