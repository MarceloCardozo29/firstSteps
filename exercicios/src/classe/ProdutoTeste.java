package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);  // instancia 1
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;                   // como foi criado um construtor l� na classe produto o construtor padr�o n�o existe mais e tivemos que seguir com o construtor feita l�
		//p1.desconto = 0.25;
		
		var p2 = new Produto();      // instancia 2
		p2.nome = "Caneta Preta";      // esse � o construtor padr�o
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Pre�o m�dio do carrinho �: R$%.2f.", mediaCarrinho);
		
	}

}
