package elements;

public class Solution {

    public boolean buddyStrings(String a, String b) {
        boolean result = false;
        if (a.length() == b.length() ){
            int contador = 0;
            for ( int c = 0; c < a.length(); c++) {

                if (a.charAt(c) != b.charAt(c)) {
                    contador += 1;
                }
            }
            if (contador == 2 ) {
                result = true;
            }
        }
    return result;
    }
}
