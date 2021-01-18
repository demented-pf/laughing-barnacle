import java.util.HashSet;
import java.util.Set;

public class Primability {
    public static void main(String[] args) {
        Primability h = new Primability();
        h.isPrime(4);
    }
    public boolean isPrime(int N) {
        int g = (int) Math.sqrt(N);
        if (g * g == N){
            return false;
        }

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0){
                return false;
            }
        }

        return true;
    }
}
