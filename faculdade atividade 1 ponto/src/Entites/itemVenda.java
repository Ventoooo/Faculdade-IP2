package Entites;

public class itemVenda extends Produto{

	private int quantidade;
	
	//getters e setters
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//metodos
	
	public double calcularTotal() {
		
		return ( quantidade * getPreco());
	}

	//Construtores
	
	public itemVenda(String nome, double preco, int quantidade) {
		super(nome, preco);
		this.quantidade = quantidade;
		// TODO Auto-generated constructor stub
	}

}
