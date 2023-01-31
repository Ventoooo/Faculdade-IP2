

public class Main {
    public static float cavaloNoTabuleiro(int x, int y, int k){
        if(x < 0 || x > 7){
            return 0;
        }
        if(y < 0 || y > 7){
            return 0;
        }
        if(k == 0){
            return 1f;
        }

        float p = 0;
        int n = 0, m = 0;

        // Movimento 1
        n = x + 2;
        m = y + 1;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;
        System.out.println(cavaloNoTabuleiro(n, m, k-1) * 1/8f);

        // Movimento 2
        n = x - 2;
        m = y + 1;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 3
        n = x + 2;
        m = y - 1;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 4
        n = x - 2;
        m = y - 1;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 5
        n = x + 1;
        m = y + 2;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 6
        n = x - 1;
        m = y + 2;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 7
        n = x + 1;
        m = y - 2;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        // Movimento 8
        n = x - 1;
        m = y - 2;
        p += cavaloNoTabuleiro(n, m, k-1) * 1/8f;

        return p;
    }
    public static void main(String[] args) {
        float x = cavaloNoTabuleiro(0, 1, 2);
        x = x*100;
        System.out.println("Probabilidade: " + x + "%");
    }
}
