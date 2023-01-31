import elements.Pessoa;
import elements.RegistroVacina;
import elements.RelacaoVacinados;
import elements.Vacina;
import elements.enums.Dose;
import elements.enums.GrupoRegistro;
import elements.enums.Local;
import elements.enums.NomeVacina;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("0333787383", GrupoRegistro.IDOSOS, LocalDate.parse("1956-01-01"), "José Maria");
    Pessoa pessoa2 = new Pessoa("3830333787 ", GrupoRegistro.IDOSOS, LocalDate.parse("1954-01-01"), "Maria José");
    Pessoa pessoa3 = new Pessoa("7870333383 ", GrupoRegistro.IDOSOS, LocalDate.parse("1952-01-01"), "José Silva");
    Pessoa pessoa4 = new Pessoa("3787303383 ", GrupoRegistro.IDOSOS, LocalDate.parse("1957-01-01"), "Maria Silva");
    Pessoa pessoa5 = new Pessoa("xxxxxxxxxx", GrupoRegistro.OUTRAS_PRIORIDADES, LocalDate.parse("2000-06-14"), "Argel Bezerra");

    Vacina coronavac = new Vacina(123456, NomeVacina.CORONAVAC, "45");
    Vacina oxford = new Vacina(123457, NomeVacina.OXFORD, "46");

    RegistroVacina registro1 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa1.getGrupo(),Dose.DOSE1, Local.DRIVE_THRU_GERALDAO, "Clarice", pessoa1 );

    RegistroVacina registro2 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa2.getGrupo(),Dose.DOSE1, Local.DRIVE_THRU_GERALDAO, "Claridade", pessoa2 );

    RegistroVacina registro3 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa3.getGrupo(),Dose.DOSE1, Local.DRIVE_THRU_GERALDAO, "Claridao", pessoa3 );

    RegistroVacina registro4 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa4.getGrupo(),Dose.DOSE1, Local.DRIVE_THRU_GERALDAO, "Clarão", pessoa4 );

    RegistroVacina registro5 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa5.getGrupo(),Dose.DOSE1, Local.DRIVE_THRU_GERALDAO, "Clariboia", pessoa5 );

    RegistroVacina registro6 = new RegistroVacina(coronavac.getCodigo(), coronavac.getNome(), coronavac.getLote(),
            "234", LocalDate.now(), pessoa5.getGrupo(),Dose.DOSE2, Local.DRIVE_THRU_GERALDAO, "Claridao", pessoa5 );

        RelacaoVacinados relacao1 = new RelacaoVacinados();

        relacao1.registo(registro1);
        relacao1.registo(registro2);
        relacao1.registo(registro3);
        relacao1.registo(registro4);
        relacao1.registo(registro5);
        relacao1.registo(registro6);

        relacao1.tabela();

        System.out.println();

        relacao1.listarPessoasQueNaoTomaram2aDose();
        relacao1.totalDeVacinados2aDose();
        relacao1.TotalDeIdosoQueTomaram2aDose();
        System.out.printf("%nTotal de pessoas acima de 65 anos que foram vacinados : %.0f",
                relacao1.calcularTotalVacinadosAcimaDe(65));


    }
}