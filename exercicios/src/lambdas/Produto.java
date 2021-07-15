package lambdas;

public class Produto extends Object {                //A classe m�e de todas as classes � a Object todas as outras s�o filhas dela e extendem dela implicitamente, nem precisa colocar
	
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {       //foi gerado um construtor usando Fields  usando o comando  --- Alt + Shift + S
		//super();                                                      // n�o precisa referenciar a classe m�e (Object)  ja que est� implicito
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {                                          // FIZ ISSO AQUI PRA SAIR  CORRETO L� EM CONSUMIDOR
		double precoFinal = preco * (1 - desconto);
		return nome + " tem pre�o de R$" + precoFinal;
	}

}
