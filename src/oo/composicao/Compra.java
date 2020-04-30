package oo.composicao;

import java.util.ArrayList;

public class Compra {
	 
	String cliente;
	//rela��o unidirecional. A compra tem a lista de itens.
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
		
	}

	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
		
	}


	double obterValorTotal() {
		double total = 0;
		
		for(Item item:itens) {
			total+=item.quantidade *  item.preco;
		}
		
		return total;
	}
	
}
