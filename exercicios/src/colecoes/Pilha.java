package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

//FIRST IN FIRST OUT

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Silmarilion");
		livros.push("Fundação");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());           //imprimiu O Hobbit já que FIFO - PRIMEIRO A ENTRAR, PRIMEIRO A SAIR
		System.out.println(livros.element());        //imprimiu O Hobbit já que FIFO - PRIMEIRO A ENTRAR, PRIMEIRO A SAIR
		
		
		System.out.println(livros.poll()); // remove hobbit
		System.out.println(livros.poll());  // remove fundação
		System.out.println(livros.poll());  // remove Silmarilion 
		System.out.println(livros.poll());  // retorna null 
	}
	
	

}
