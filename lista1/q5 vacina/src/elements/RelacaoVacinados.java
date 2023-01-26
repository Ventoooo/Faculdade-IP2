package elements;

import java.util.ArrayList;
import java.util.Objects;

public class RelacaoVacinados {

    //Atributos
    ArrayList<RegistroVacina> vacinados = new ArrayList<>();

    //Metodos
    public void registo(RegistroVacina vacinado){
        vacinados.add(vacinado);
        System.out.println("adicionado");
    }

    public double calcularTotalVacinadosAcimaDe( int idade){
        int count = 0;
        for( RegistroVacina idd : vacinados ){
            if (idd.getPessoa().calcularIdade() >= idade){
                count += 1;
            }
        }
        return count;
    }

    public void TotalDeIdosoQueTomaram2aDose(){
        int count = 0;
        for( RegistroVacina idd : vacinados ){
            if (idd.getGrupo().equals("idosos")){
                count += 1;
            }
        }
        System.out.println("A quatidade de idosos que foram vacinados foi de : " + count);
    }
//    public void listarPessoasQueNaoTomaram2aDose(){}

}
