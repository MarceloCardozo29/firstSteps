package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {                 
	
	public static void main(String[] args) {
		                         //LAMBDA CRIADA EMBAIXO
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");               //Consumer recebe um unico parametro ou atributo e não tem retorno	
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);                                                       //accept é um método da função
		
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Lápis", 7.80, 0.18);
		Produto p5 = new Produto("Borracha", 4.39, 0.19);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);   //forEach já recebe um consumer e sabe que vai ter que chamar um accept
		//ou embaixo de forma mais manual so que chamei o preco e não o nome
		produtos.forEach(p -> System.out.println(p.preco));    //lambda que imprimi o preço do produto
		
		// ou
		//produtos.forEach(System.out::println); //ASSIM IMPRIMI O ENDEREÇO DA LAMBDA EX: lambdas.Produto@38af3868  PRECISA DO toString lá em Produto
		
		produtos.forEach(System.out::println);
		
	}

}
