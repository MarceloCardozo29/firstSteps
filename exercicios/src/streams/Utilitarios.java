package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	private Utilitarios() {            //private daí não pode ser criado nada la em Map
		
	}
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	public final static String grito (String n) {
		return n + "!!! ";
	}
	

}
