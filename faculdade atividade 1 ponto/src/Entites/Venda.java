package Entites;


import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda extends Cliente {

	//datadate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	// Atributos
	
	private LocalDateTime data = LocalDateTime.parse("2020-12-23T01:20:30");
	private String atendente;
	

	
	public ArrayList<itemVenda> listaDeCompras = new ArrayList<>();
	
	// Getters e Setters
	
	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	//Metodos 
	
	public void adicionarItem(itemVenda item) {
		
		listaDeCompras.add(item);
	}

	public double calcularTotal() {
		
		double c = 0;
		
		for (int i = 0; i < listaDeCompras.size(); i++) {
			c += listaDeCompras.get(i).getPreco();
		}
		return c;
		
	}
	
	public void listarItensVenda(){
		double max = 0;
		System.out.printf("%nData da Venda: %s", data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.printf("%nCliente: %s | CPF: %s | idade: %d", getNome(), getCpf(), idade());
		System.out.printf("%nAtendente: %-40s",atendente);
		System.out.printf("%nNome do produto | Preço | Quantidade | Total");
		System.out.printf("%n-----------------------------------------------------");
		for (int i = 0; i < listaDeCompras.size(); i++) {
			System.out.printf("%n%-16s|R$%5.2f|%12d| R$%8.2f", 
					listaDeCompras.get(i).getNome(),
					listaDeCompras.get(i).getPreco(),
					listaDeCompras.get(i).getQuantidade(),
					listaDeCompras.get(i).calcularTotal());
			max += listaDeCompras.get(i).calcularTotal();
		}
		System.out.printf("%n-----------------------------------------------------");
		System.out.printf("%nTotal da Venda:%34.2f", max);


	}
	
	//Construtores
	
	public Venda(String cpf, String nome, String atendente) {
		super(cpf, nome);
		this.atendente = atendente;
	}
}
