package elements;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String cpf;
    private String grupo;
    private LocalDate dataNascimento;

    //Getters and setters


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
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
}
