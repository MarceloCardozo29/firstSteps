package fundamentos;

public class Inferencia {
	 public static void main(String[] args) {
		 
		 double a = 4.5;
		 System.out.println(a);
		 
		 var b = 4.6;              // O Java infere, ele "v�" e reconhece o tipo de dado digitado e imprimi.
		 
		 System.out.println(b);
		
		 var c = " O texto � texto";
		 System.out.println(c);
		 
		 c = " outro texto";     // O java ja amarrou que a vari�vel C � String, ent�o n�o aceitar� um valor inteiro ou outro tipo de vari�vel		 
		 System.out.println();
		 
		 
		 
	}
}
