package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		// lista de valores inteiros com o nome de nums recebe uma arraylist (uma lista)
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		                             // ac é o acumulador e n é o número 1, depois na segunfa vez será o 2 e depois o 3 e assim até terminar todo o arraylist
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		// reduce é uma operação final como o forEach
		Integer total1 = nums.stream().reduce(soma).get();  // valor final 45
		//Integer total1 = nums.parallelStream().reduce(soma).get();   // valor final foi 45 tbem pq não passei o valor inicial do acumulador
		
		System.out.println(total1);
		
		                      // foi executado paralelamente varias vezes, o valor(acumulador) 100 foi usado varias vezes resultado final foi 945
		//Integer total2 = nums.parallelStream().reduce(100, soma);
		
		Integer total2 = nums.stream().reduce(100, soma);   // valor final 145
		System.out.println(total2);
		
		
		//Resultado foi um Opcional<Integer>...
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
		
	}

}
