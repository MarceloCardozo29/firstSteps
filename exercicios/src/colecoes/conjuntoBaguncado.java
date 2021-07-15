package colecoes;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })      //ctrl 1 encima do (HashSet)    tirou a advertencia, aquele triangulo amarelo + outro ctrl 1 encima do (conjunto) para tirar advertencia
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);    //coleções não aceitam tipos primitivos  converteu um double -> Double mas  aceita classes que correspondem aos tipos primitivos
		conjunto.add(true);       // boolean -> Boolean
		conjunto.add("Teste");      //String não converte pois já é um objeto
		conjunto.add(1);           //  int -> Integer   converteu int para integer
		conjunto.add('x');        //aqui converte char para caractere 
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("testa");
	
		System.out.println("Tamanho é " + conjunto.size());      //conjunto não é length é size
		
		System.out.println(conjunto.remove("teste")); //false não existe teste dentro do conjunto
		System.out.println(conjunto.remove("Teste"));  //true existe Teste dentro do conjunto
		
	
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
	
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
	   //	conjunto.addAll(nums);    //União entre dois conjuntos
		conjunto.retainAll(nums);   // vai reter aquilo que for comum (repetido) aos dois grupos, no nosso caso o número 1
		System.out.println(conjunto);
		
		conjunto.clear();                    // limpa o conjunto
		System.out.println(conjunto);
		
		

		
	
	
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


