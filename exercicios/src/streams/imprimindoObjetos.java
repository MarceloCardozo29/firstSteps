package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String>aprovados = Arrays.asList("Lu", "Gui", "Ju", "Ana");    // nome da Lista aprovados
		
		System.out.println("Usando o foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator..."); 
		Iterator<String> iterator = aprovados.iterator();   // dei o nome pro Iterador(interface) de iterator
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String>  stream = aprovados.stream();      //stream =  sequencia de dados
		stream.forEach(System.out::println);             // Laço interno!!!!!
		
	}

}
