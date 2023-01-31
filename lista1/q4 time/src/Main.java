import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static double calcularDiasUteis(LocalDate a, LocalDate b){

        double dias = 0;

        if ( Period.between(a, b).getYears() > 0 ) {
            dias = dias + Period.between(a, b).getYears() * 252;
        }
        else{
            dias = dias - (Period.between(a, b).getYears()) * 252;}

        if (Period.between(a, b).getMonths() > 0) {
            dias = dias + Period.between(a, b).getMonths() * 21;
        }
        else {
            dias = dias - (Period.between(a, b).getMonths()) * 21;}

        if (Period.between(a, b).getDays() > 0 ) {
            dias = dias + (Period.between(a, b).getDays());
        }
        else {  dias = dias - (Period.between(a, b).getDays());}

        if (a.isAfter(b)){
            dias = dias * -1;
        }

        return Math.ceil(dias);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data: [dd mm yyyy]");
        String data = sc.nextLine();

        String[] data_formatada = data.split(" ");


        LocalDate data_ = LocalDate.parse(data_formatada[2]+"-"+data_formatada[1]+"-"+data_formatada[0]);

        System.out.printf("%n%nImprima a diferença (em dias) da data de hoje para a data que o usuário digitou no teclado: %n");

        double dias = 0;

            if ( Period.between(data_, LocalDate.now()).getYears() > 0 ) {
                dias = dias + Period.between(data_, LocalDate.now()).getYears() * 365;
            }
            else{
                dias = dias - (Period.between(data_, LocalDate.now()).getYears()) * 365;}

            if (Period.between(data_, LocalDate.now()).getMonths() > 0) {
                dias = dias + Period.between(data_, LocalDate.now()).getMonths() * 30.4167;
            }
            else {
                dias = dias - (Period.between(data_, LocalDate.now()).getMonths()) * 30.4167;}

            if (Period.between(data_, LocalDate.now()).getDays() > 0) {
                dias = dias + (Period.between(data_, LocalDate.now()).getDays());
            }
            else {  dias = dias - (Period.between(data_, LocalDate.now()).getDays());}

        System.out.printf("    %.0f dias%n", Math.ceil(dias));


        System.out.printf("%nSome 110 dias à data digitada pelo usuário e imprima qual a nova data obtida: %n");
        System.out.print("    "+data_.plusDays(110));

        System.out.printf("%n%nAltere o mês da data informada para ser igual ao mês de agosto%n");
        System.out.print("    "+data_.parse(data_formatada[2]+"-08-"+data_formatada[0]));

        System.out.printf("%n%nImprima a data alterada no formato “dd-MMM-YYYY”%n");
        System.out.print("    "+  data_.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.printf("%n%nDigite duas datas%n");
        System.out.printf("%nData A [dd mm yyyy] : ");
        String a = sc.nextLine();
        System.out.printf("%nData B [dd mm yyyy] : ");
        String b = sc.nextLine();

        String[] a_ = a.split(" ");
        String[] b_ = b.split(" ");

        LocalDate data_a = LocalDate.parse(a_[2]+"-"+a_[1]+"-"+a_[0]);
        LocalDate data_b = LocalDate.parse(b_[2]+"-"+b_[1]+"-"+b_[0]);

        System.out.printf("%.0f", calcularDiasUteis(data_a, data_b));
    }
}