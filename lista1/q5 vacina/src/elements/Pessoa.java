package elements;

import elements.enums.GrupoRegistro;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String cpf;
    private GrupoRegistro grupo;
    private LocalDate dataNascimento;
    private String nome;

    //Construtor

    public Pessoa(String cpf, GrupoRegistro grupo, LocalDate dataNascimento, String nome) {
        this.cpf = cpf;
        this.grupo = grupo;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }


    //Getters and setters


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGrupo() {
        return grupo.getRegistro();
    }

    public void setGrupo(GrupoRegistro grupo) {
        this.grupo = grupo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
