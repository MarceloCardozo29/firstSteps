package lambdas;

public class Produto extends Object {                //A classe mãe de todas as classes é a Object todas as outras são filhas dela e extendem dela implicitamente, nem precisa colocar
	
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {       //foi gerado um construtor usando Fields  usando o comando  --- Alt + Shift + S
		//super();                                                      // não precisa referenciar a classe mãe (Object)  ja que está implicito
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {                                          // FIZ ISSO AQUI PRA SAIR  CORRETO LÁ EM CONSUMIDOR
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal;
	}

}
