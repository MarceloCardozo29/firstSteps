package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){                        //criando esse construtor aqui o construtor l� de ProdutoTeste se perde
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	
	
	
	
	
}
