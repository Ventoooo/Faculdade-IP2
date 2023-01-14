package Aplication;

import Entites.Cliente;
import Entites.Venda;
import Entites.itemVenda;
import Entites.Produto;


public class App {

	public static void main(String[] args) {
		

		
		Produto produto_01 = new Produto("Produto 01", 10.00);
		Produto produto_02 = new Produto("Produto 02", 5.00);
		Produto produto_03 = new Produto("Produto 03", 20.00);
		Produto produto_04 = new Produto("Produto 04", 15.00);
		
		
		itemVenda ItemVenda_01 = new itemVenda(produto_01.getNome(),produto_01.getPreco(), 10);
		itemVenda ItemVenda_02 = new itemVenda(produto_02.getNome(),produto_02.getPreco(), 5);
		itemVenda ItemVenda_03 = new itemVenda(produto_03.getNome(),produto_03.getPreco(), 10);
		itemVenda ItemVenda_04 = new itemVenda(produto_04.getNome(), produto_04.getPreco(), 2);
		
		Cliente Cliente = new Cliente("123456" , "José Maria Marques");
		
		Venda Venda = new Venda(Cliente.getCpf(),Cliente.getNome(), "Maria Dolores Sampaio");
		

		Venda.adicionarItem(ItemVenda_01);
		Venda.adicionarItem(ItemVenda_02);
		Venda.adicionarItem(ItemVenda_03);
		Venda.adicionarItem(ItemVenda_04);
		
		Venda.listarItensVenda();
		

		
		
		
		
	}

}
