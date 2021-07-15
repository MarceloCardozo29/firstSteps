package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		        // não recebe nenhum parametro de entrada mas é obrigado a colocar o parenteses pois faz parte da sintaxe
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "João", "Maria");          //tipo de retorno dentro de Supplier será List<String>
		
		System.out.println(umaLista.get());
	}

}
