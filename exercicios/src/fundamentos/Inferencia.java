package fundamentos;

public class Inferencia {
	 public static void main(String[] args) {
		 
		 double a = 4.5;
		 System.out.println(a);
		 
		 var b = 4.6;              // O Java infere, ele "vê" e reconhece o tipo de dado digitado e imprimi.
		 
		 System.out.println(b);
		
		 var c = " O texto é texto";
		 System.out.println(c);
		 
		 c = " outro texto";     // O java ja amarrou que a variável C é String, então não aceitará um valor inteiro ou outro tipo de variável		 
		 System.out.println();
		 
		 
		 
	}
}
