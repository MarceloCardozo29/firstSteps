package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		/*
		 * 1 - Número para string binaria... 6 => "110"
		 * 2 - Inverter a string..."110" => "011"
		 * 3 - Converter de volta para inteiro => "011" => 3
		 */
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();  // AQUI FOI O 2
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);          // AQUI FOI O 3
		                                                     // parseInt espera uma String com valor decimal, mas quando coloca o 2 ele entende que estamos passando uma string binaria e vai converter para inteiro
		nums.stream()
			.map(Integer::toBinaryString)  // AQUI FOI O 1
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
	}

}
