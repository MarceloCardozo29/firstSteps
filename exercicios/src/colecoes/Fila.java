package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add - adicionam elementos na fila
		//diferença é o comportamento quando a fila esta cheia
		
		fila.add("Anna");       //add gera erro se não conseguir adicionar mais conteúdo na fila(por exemplo se estiver cheia)
		fila.offer("Bia");      //offer retorna falso se não conseguir adicionar mais conteúdo a fila (por exemplo se estiver cheia)
		fila.add("Carlos");       // retorna falso
		fila.offer("Daniel");     //offer lança uma exceção
		fila.add("Rafaela");
		fila.offer("Guilherme");
		
		//peek e element - obtem o proximo elemento da fila (sem remover)  a diferença é no comportamento quando a fla estiver vazia
		
		System.out.println(fila.peek());      //peek retorna null, não gera problema
		System.out.println(fila.peek());
		System.out.println(fila.element());      // element vai gerar erro de excessão
		System.out.println(fila.element());
		
		
	//	fila.size();
	//	fila.clear();
	//	fila.isEmpty();
		
		//poll e remove obtem o proximo elemento da fila  e remove.
		
		System.out.println(fila.poll());    
		System.out.println(fila.poll());    // retorna null se a fila estiver vazia 
		System.out.println(fila.poll());
		System.out.println(fila.remove());   // lança uma excessão
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
