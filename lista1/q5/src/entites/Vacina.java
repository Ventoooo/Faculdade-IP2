package entites;

import entites.enums.Origem;

public class Vacina {

    private int codigo;
    private Origem nome;
    private String lote;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
