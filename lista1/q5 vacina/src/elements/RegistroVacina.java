package elements;

import elements.enums.Dose;
import elements.enums.GrupoRegistro;
import elements.enums.Local;
import elements.enums.NomeVacina;

import java.time.LocalDate;
import java.util.IdentityHashMap;

public class RegistroVacina extends Vacina{

    private String id;

    private LocalDate data_vacinacao;

    private String grupo;

    private Dose dose;

    private Local local;

    private String atendente;

    private Pessoa pessoa;

    //constructor

    public RegistroVacina(int codigo, NomeVacina nome, String lote, String id,
                          LocalDate data_vacinacao, String grupo,
                          Dose dose, Local local, String atendente,
                          Pessoa pessoa) {
        super(codigo, nome, lote);
        this.id = id;
        this.data_vacinacao = data_vacinacao;
        this.grupo = grupo;
        this.dose = dose;
        this.local = local;
        this.atendente = atendente;
        this.pessoa = pessoa;
    }


    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData_vacinacao() {
        return data_vacinacao.plusMonths(1);
    }

    public String getGrupo() {
        return grupo;
    }


    public int getDose() {
        return dose.getTipo();
    }


    public String getLocal() {
        return local.getLocal();
    }


    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
