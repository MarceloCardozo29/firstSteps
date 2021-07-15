package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	 void adicionarCompra(Compra compra) {             //criando a fun�ao
		 this.compras.add(compra);
	 }
	
	
	double obterValorTotal() {
		double total = 0;
		
		
		for(Compra compra: compras) {             //Nome da Classe e depois nome da variavel
			total += compra.obterValorTotal();
		}
		
		return total;
		
	}
}
