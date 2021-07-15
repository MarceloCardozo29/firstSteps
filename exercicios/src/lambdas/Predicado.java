package lambdas;

import java.util.function.Predicate;

public class Predicado {          // PREDICADO RECEBE UM ÚNICO PARAMETRO E RETORNA VERDADEIRO OU FALSO 
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;              // -> indica que é uma função Lambda
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
		
	}
	

}
