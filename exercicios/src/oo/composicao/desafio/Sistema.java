package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Noteboook",1897.88), 2);
		
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		
		Cliente cliente = new Cliente("Ana Julia Silva ");
		cliente.adicionarCompra(compra1);              // foi criado uma função lá em cliente para usar aqui  // esse jeito é melhor
		cliente.compras.add(compra2);                 // outro jeito de adicionar a compra seria esse
		
		System.out.println(cliente.obterValorTotal());
		
	}

}


