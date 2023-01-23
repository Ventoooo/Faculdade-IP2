import elements.Pessoa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setDataNascimento(LocalDate.of(2000,06,14));


        System.out.println(pessoa1.calcularIdade());
    }
}