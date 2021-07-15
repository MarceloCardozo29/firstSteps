package lambdas;

import java.util.function.Function;
                                        //COMPOSI��O DE FUN��ES           //FUN��ES PEQUENAS
public class Funcao {               //ENCADEAMOS FUN��ES A SAIDA EM UMA FOI ENTRADA EM OUTRA
	
	public static void main(String[] args) {
		// vai receber um Integer e vai retornar uma String
		Function<Integer, String> parOuImpar = numero -> numero %2 == 0 ? "Par" : "Impar";   //Recebo um n�mero divido por 2 se o restante da divis�o for 0 ele � par,  caso contrario impar
		// A SA�DA DE UM METODO DEVE SER A ENTRADA DE OUTRO o resultado String dessa fun��o entra como parametro para a proxima fun��o
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O Resultado �: " + valor;
		// A SA�DA DE UM METODO DEVE SER A ENTRADA DE OUTRO  o resultado String dessa fun��o entra como parametro para a proxima fun��o
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		
		System.out.println(resultadoFinal1);
		
		
		
		Function<String, String> comDuvida = valor -> valor + "???";
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(comDuvida).apply(33);
		
		System.out.println(resultadoFinal2);
		
		
		
	}
	

}
