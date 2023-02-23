package br.ufrpe.academico.enums;

public enum CategoriaNota {

        primeiraP("1a"), segundaP ("2a"), terceira("3a");

        private final String cNota;

        CategoriaNota(String cNota){
            this.cNota = cNota;
        }

        public String getcNota(){
            return cNota;
        }
}


-------------------------------------

package br.ufrpe.academico.enums;

public enum DiasSemana {

    SEGUNDA, TERCA, QUARTA, QUITA, SEXTA, SABADO, DOMINGO;
}
