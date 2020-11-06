

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            String jewel = input.next();
            String stones = input.next();
            Set<Character> h = new HashSet<>();
            for (int j = 0; j < jewel.length(); j++) {
                h.add(jewel.charAt(j));
            }
            int counter = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (h.contains(stones.charAt(j))){
                    counter ++;
                }
            }
            System.out.println(counter);
        }
    }
}
