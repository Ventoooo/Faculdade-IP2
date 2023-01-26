package elements.enums;

public enum GrupoRegistro {

    IDOSOS("idosos"),
    TRABALHADORES_DA_SAUDE("Trabalhadores da saúde"),
    OUTRAS_PRIORIDADES("Outras Prioridades");

    private final String registro;

    GrupoRegistro(String registro){
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }
}
