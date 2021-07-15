package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Bmw ", "Audi ", "Honda");
		                                         // foreach � uma opera��o terminal, depois dela n�o vem mais nada  
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);        // construindo a stream   // map recebe uma function e retorna umq stream  
		                         // colocando em letras maiusculas
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();  // tr�s express�es lambda que recebem string e retornam string
		//comentei acima pois ela foi criada a fun��o la em Utilitarios
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		//UnaryOperator<String> grito = n -> n + "!!! ";
		//comentei acima pois ela foi criada a fun��o la em Utilitarios
		
		System.out.println("\n\nUsando Composi��o...");
		marcas.stream()
			.map(Utilitarios.maiuscula)   //chamou  a fun��o la em Utilitarios
			.map(primeiraLetra)     // chamou a lambda
			.map(Utilitarios::grito)  // //chamou  a fun��o la em Utilitarios
			.forEach(print);
		
	}

}
