package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		//Produto p = new Produto ("Ipad Air", 3235.89, 0.13);
		
		/*
		 * 1 - calcular o preço real com desconto
		 * 2 - imposto municipal se preço maior que 2500 se menor isento
		 * 3 - Frete se preco maior que 3000 sera 100 se menor que 3000 50
		 * 4 - Arredondar para2 casas decimais
		 * 5 - Formatar: R$ 1234,56
		 * 
		 */
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * ( 1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco)); //ALGUM CONFLITO NO ARREDONDAR NÃO PERMITE A EXECUÇÃO TOTAL, MAS SE COMENTAR ESSE LINHA O RESTO FUNCIONA
	
		
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto p = new Produto ("Ipad Air", 3235.89, 0.13);
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		
	//	String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(formatar).apply(p);
		
		System.out.println("O preço final é de " + preco);
	}
	
	
}







