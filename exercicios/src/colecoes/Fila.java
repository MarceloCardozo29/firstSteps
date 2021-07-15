package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add - adicionam elementos na fila
		//diferen�a � o comportamento quando a fila esta cheia
		
		fila.add("Anna");       //add gera erro se n�o conseguir adicionar mais conte�do na fila(por exemplo se estiver cheia)
		fila.offer("Bia");      //offer retorna falso se n�o conseguir adicionar mais conte�do a fila (por exemplo se estiver cheia)
		fila.add("Carlos");       // retorna falso
		fila.offer("Daniel");     //offer lan�a uma exce��o
		fila.add("Rafaela");
		fila.offer("Guilherme");
		
		//peek e element - obtem o proximo elemento da fila (sem remover)  a diferen�a � no comportamento quando a fla estiver vazia
		
		System.out.println(fila.peek());      //peek retorna null, n�o gera problema
		System.out.println(fila.peek());
		System.out.println(fila.element());      // element vai gerar erro de excess�o
		System.out.println(fila.element());
		
		
	//	fila.size();
	//	fila.clear();
	//	fila.isEmpty();
		
		//poll e remove obtem o proximo elemento da fila  e remove.
		
		System.out.println(fila.poll());    
		System.out.println(fila.poll());    // retorna null se a fila estiver vazia 
		System.out.println(fila.poll());
		System.out.println(fila.remove());   // lan�a uma excess�o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
