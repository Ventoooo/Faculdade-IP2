package elements;

public class Produto {

    private String codigo;
    private String nome;

    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
