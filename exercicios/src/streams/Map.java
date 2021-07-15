package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Bmw ", "Audi ", "Honda");
		                                         // foreach é uma operação terminal, depois dela não vem mais nada  
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);        // construindo a stream   // map recebe uma function e retorna umq stream  
		                         // colocando em letras maiusculas
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();  // três expressões lambda que recebem string e retornam string
		//comentei acima pois ela foi criada a função la em Utilitarios
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		//UnaryOperator<String> grito = n -> n + "!!! ";
		//comentei acima pois ela foi criada a função la em Utilitarios
		
		System.out.println("\n\nUsando Composição...");
		marcas.stream()
			.map(Utilitarios.maiuscula)   //chamou  a função la em Utilitarios
			.map(primeiraLetra)     // chamou a lambda
			.map(Utilitarios::grito)  // //chamou  a função la em Utilitarios
			.forEach(print);
		
	}

}
