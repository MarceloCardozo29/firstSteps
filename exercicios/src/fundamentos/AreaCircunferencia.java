package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {               // main + ctrl + espa�o
		double raio = 3.4;     //vari�vel real recebe valor 3.4
		final double Pi = 3.14159;      // final - o valor � constante n�o mudar� -- virou uma constante e por conven��o o nome � mai�sculo
		
		double area = Pi * raio * raio;
		
		System.out.println(area);                          //syso + ctrl + espa�o
		
		
		raio = 10;
		area = Pi * raio * raio;
		System.out.println("�rea: " + area + "m2");
	}

}

