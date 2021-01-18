import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exactly3divisors {
    public static void main(String[] args) {
        Exactly3divisors h = new Exactly3divisors();
        System.out.println(h.exactly3Divisors(6));
    }
    public static int[] getPrimes(int num){
        Set<Integer> compos = new HashSet<>();
        int[] prime = new int[num];
        int c = 0;
        for (int i = 2; i < num; i++) {
            if (!compos.contains(i)){
                prime[c] = i;
                c ++;
                int counter = (int) Math.pow(i, 2);
                while (counter < num){
                    compos.add(counter);
                    counter += i;
                }
            }
        }
        return prime;
    }
    public int exactly3Divisors(int N)
    {
        int[] h = getPrimes(N+1);
        int counter = 0;
        int g = 2;
        int c = 0;
        while (N > g*g){
            g = h[c];
            c ++;
            if (N > g*g){
                counter ++;
            }
        }
        return counter;
    }
}
