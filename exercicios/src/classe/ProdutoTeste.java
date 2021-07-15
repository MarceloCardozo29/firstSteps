package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);  // instancia 1
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;                   // como foi criado um construtor lá na classe produto o construtor padrão não existe mais e tivemos que seguir com o construtor feita lá
		//p1.desconto = 0.25;
		
		var p2 = new Produto();      // instancia 2
		p2.nome = "Caneta Preta";      // esse é o construtor padrão
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Preço médio do carrinho é: R$%.2f.", mediaCarrinho);
		
	}

}
