package lambdas;

import java.util.Arrays;
import java.util.List;


public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {   
			System.out.println(nome);
		}
			
		
		System.out.println("\nLambda #01...");
		
		//para cada elemento de aprovados -> execute......
		aprovados.forEach(nome -> {System.out.println(nome + "!!!"); });                   //forEach() aqui nesse contexto é uma função
		               // como nome é apenas um parâmetro pode ficar sem parenteses, se for 2 ou mais, colocar parenteses
		
		
		System.out.println("\nMethod Reference 1...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
		
		
	}
	
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
	
	

}
