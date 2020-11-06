

import java.util.HashSet;
import java.util.Set;

public class findPrimes {
    public static void main(String[] args) {
        Set<Integer> h = new HashSet<>();
        int c = 0;
        for (int i = 2; i < 1000000; i++) {
            if (!h.contains(i)){
                System.out.println(i);
                int counter = (int) Math.pow(i, 2);
                while (counter < 1000000){
                    h.add(counter);
                    counter += i;
                }
                c++;
            }

        }
        System.out.println("\n" + c);
    }
}
