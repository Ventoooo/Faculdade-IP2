package elements;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class RelacaoVacinados {

    //Atributos
    ArrayList<RegistroVacina> vacinados = new ArrayList<>();

    //Metodos
    public void registo(RegistroVacina vacinado){
        vacinados.add(vacinado);
    }

    public double calcularTotalVacinadosAcimaDe( int idade){
        int count = 0;
        for( RegistroVacina idd : vacinados ){
            if (idd.getPessoa().calcularIdade() >= idade && idd.getDose() != 2){
                count += 1;
            }
        }
        return count;
    }

    public boolean equals(Object a, Object b){
        boolean c = false;
        if(a == b){
            c = true;
        }
        return c;
    }

    public void TotalDeIdosoQueTomaram2aDose(){
        int count = 0;
        for( RegistroVacina idd : vacinados ){
            if (equals(idd.getGrupo(), "idosos"))
                if (equals(idd.getDose(), 2)){
                    count += 1;
                }
        }
        System.out.printf("%nTotal de Idosos que tomaram a 2a. dose: " + count);
    }

    public void listarPessoasQueNaoTomaram2aDose(){
        int count = 0;
        for (RegistroVacina idd : vacinados){
            if( equals(idd.getDose(), 2)){
                count += 1;
            }
        }
        System.out.printf("%nTotal de vacinados que não tomaram a 2a. dose: "+ count);

    }

    public void tabela() {
        System.out.printf("%nCPF          | Nome            | Idade | Data Indicada p. 2a Dose");
        System.out.printf("%n=================================================================");
        for (RegistroVacina idd : vacinados) {
            if(idd.getDose() == 1){
            System.out.printf("%n%-13s| %-16s| %5d | %24s", idd.getPessoa().getCpf(),
                    idd.getPessoa().getNome(), idd.getPessoa().calcularIdade(), idd.getData_vacinacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        }

    }

    public void totalDeVacinados2aDose(){
        int count = 0;
        for(RegistroVacina idd : vacinados){
            if( idd.getDose() == 2){
                count += 1;
            }
        }
        System.out.printf("%nTotal de vacinados que tomaram a 2a. dose: "+ count);
    }

}
