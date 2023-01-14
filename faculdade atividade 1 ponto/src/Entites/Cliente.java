package Entites;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Cliente {

	private String cpf;
	private String nome;
	private static LocalDate dataNascimento = LocalDate.parse("1995-12-23");
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		
	}

	public static int idade() {
	    return Period.between(dataNascimento, LocalDate.now()).getYears();
	}
}
