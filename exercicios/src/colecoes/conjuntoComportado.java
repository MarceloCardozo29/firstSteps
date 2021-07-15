package colecoes;

import java.util.HashSet;
import java.util.Set;


import java.util.SortedSet;
import java.util.TreeSet;




public class conjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>();       //<String> nesse grupo s� pode ter String //grupo n�o ordenado
		SortedSet<String> listaAprovados = new TreeSet<String>();    //TreeSet aceita grupo ordenado, organiza em ordem
		listaAprovados.add("Ana");                                   //Se colocar algo que n�o seja String daria erro de compila��o e o Java nem executaria o programa
		listaAprovados.add("Carlos");
		listaAprovados.add("Luka");
		listaAprovados.add("Pedro");
		
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<>();    //n�o aceita tipos primitivos por isso colocou o Integer pois aceita classes que correspondem aos tipos primitivos
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n); 
		}
		
		
		
		
	}
	
	

}
