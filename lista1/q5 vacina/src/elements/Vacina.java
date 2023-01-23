package elements;

import elements.enums.NomeVacina;

public class Vacina {

    //Atributos

    private int codigo;
    private NomeVacina nome;
    private String lote;

    //Getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public NomeVacina getNome() {
        return nome;
    }

    public void setNome(NomeVacina nome) {
        this.nome = nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
