

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
    public static Set<Integer> getPrimes(int num){
        Set<Integer> compos = new HashSet<>();
        Set<Integer> prime = new HashSet<>();
        for (int i = 2; i < num; i++) {
            if (!compos.contains(i)){
                prime.add(i);
                int counter = (int) Math.pow(i, 2);
                while (counter < num){
                    compos.add(counter);
                    counter += i;
                }
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        Set<Integer> hash = getPrimes(1000000);
        while (test -- != 0) {
            int l = input.nextInt();
            HashMap<Integer, Integer> factors = new HashMap<>();

            for (int i = 0; i < l; i++) {
                int num = input.nextInt();
                if (hash.contains(num)) {
                    if (!factors.containsKey(num)) {
                        factors.put(num, 1);
                    } else {
                        factors.replace(num, (factors.get(num)) + 1);
                    }
                } else {
                    calculateFactors(num, hash, factors);
                }

            }
            int product = 1;
            for (int k : factors.keySet()) {
                product *= factors.get(k) + 1;
            }
            System.out.println(product);
        }
    }

    private static void calculateFactors(int num, Set<Integer> hash, HashMap<Integer, Integer> factors) {
        while (num != 1){
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0 && hash.contains(i)){
                    if (!factors.containsKey(i)){
                        factors.put(i, 1);
                    }
                    else {
                        factors.replace(i, (factors.get(i))+1);
                    }
                    num /= i;

                    if (hash.contains(num)){
                        if (!factors.containsKey(num)){
                            factors.put(num, 1);
                        }
                        else {
                            factors.replace(num, (factors.get(num))+1);
                        }
                        num = 1;
                        break;
                    }
                }
            }
        }
    }
}
