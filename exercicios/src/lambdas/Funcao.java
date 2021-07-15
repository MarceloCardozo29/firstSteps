package lambdas;

import java.util.function.Function;
                                        //COMPOSIÇÃO DE FUNÇÕES           //FUNÇÕES PEQUENAS
public class Funcao {               //ENCADEAMOS FUNÇÕES A SAIDA EM UMA FOI ENTRADA EM OUTRA
	
	public static void main(String[] args) {
		// vai receber um Integer e vai retornar uma String
		Function<Integer, String> parOuImpar = numero -> numero %2 == 0 ? "Par" : "Impar";   //Recebo um número divido por 2 se o restante da divisão for 0 ele é par,  caso contrario impar
		// A SAÍDA DE UM METODO DEVE SER A ENTRADA DE OUTRO o resultado String dessa função entra como parametro para a proxima função
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O Resultado é: " + valor;
		// A SAÍDA DE UM METODO DEVE SER A ENTRADA DE OUTRO  o resultado String dessa função entra como parametro para a proxima função
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		
		System.out.println(resultadoFinal1);
		
		
		
		Function<String, String> comDuvida = valor -> valor + "???";
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(comDuvida).apply(33);
		
		System.out.println(resultadoFinal2);
		
		
		
	}
	

}
