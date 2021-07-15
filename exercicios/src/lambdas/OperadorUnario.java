package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;    // 0 + 2
		UnaryOperator<Integer> vezesDois = n -> n * 2;   // 2 * 2
		UnaryOperator<Integer> aoQuadrado = n -> n * n;  // 4 * 4
		
		// ENCADEAMENTO DE FUNÇOES
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		//COMPOSE vai na ordem inversa
		
		  // antes de executar ao quadrado execute vezes dois, antes de executar vezes dois execute mais dois
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);                    // ENCADEAMENTO DE FUNÇOES
		System.out.println(resultado2);
		
		
		
		
	}

}
