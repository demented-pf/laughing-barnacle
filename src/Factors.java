

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Factors {
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
    public static void main(String[] args) throws java.lang.Exception{
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        HashMap<Integer,Integer> cache = new HashMap<>();
        for (int m = 0; m < test; m++) {
            HashMap<Integer, Integer> numPrimes = new HashMap<>();
            int l = input.nextInt();
            int num = 1;
            for (int i = 0; i < l; i++) {
                num *= input.nextInt();
            }
            Set<Integer> prime = getPrimes(num);
            while (num != 1) {
                for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                    if (num % i == 0 && prime.contains(i)) {
                        if (numPrimes.containsKey(i)) {
                            int g = numPrimes.get(i);
                            numPrimes.replace(i, g + 1);
                        } else {
                            numPrimes.put(i, 1);
                        }
                        num /= i;
                        if (prime.contains(num)) {

                            if (numPrimes.containsKey(num)) {
                                int g = numPrimes.get(num);
                                numPrimes.replace(num, g + 1);
                            } else {
                                numPrimes.put(num, 1);
                            }
                            num = 1;
                            break;
                        }
                    }
                }
            }

            int product = 1;

            for (int k : numPrimes.keySet()) {
                product *= (numPrimes.get(k) + 1);
            }
            if (!cache.containsKey(num)){
                cache.put(num,product);
            }
            System.out.println(product);
        }
    }
}
