package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {    // PREDICADO � UMAINTERFACE FUNCIONAL QUE RECEBE UM PARAMETRO DE ENTRADA E RETORNA VERDADEIRO OU FALSO
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;   //Recebo um n�mero divido por 2 se o restante da divis�o for 0 ele � par
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(123));   // NEGUEI A ESPRESS�O  isPar.and(isTresDigitos)
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		// AQUI TRABALHAMOS COM AND OR E NEGATE
		
	}

}
