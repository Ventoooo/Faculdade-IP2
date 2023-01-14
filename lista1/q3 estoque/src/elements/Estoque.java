package elements;

public class Estoque {

    private Produto produto;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(Produto produto, int qtdAtual, int qtdMinima) {
        this.produto = produto;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void reporEstoque(int valorParaAdc) {
        this.qtdAtual += valorParaAdc;
    }

    public void darBaixa(int valorParaRmv) {
        this.qtdAtual -= valorParaRmv;
    }

    public void relatorio() {
         System.out.println("Estoque{" +
                "produto=" + produto.getNome() +
                ", qtdAtual=" + qtdAtual +
                ", qtdMinima=" + qtdMinima +
                '}');
    }

}
