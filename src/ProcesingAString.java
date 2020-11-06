

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProcesingAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        Set<String> h = new HashSet<>();
        for (int i = 1; i < 10; i++) {
            h.add(String.valueOf(i));
        }
        while (tests-- > 0){
            String s = input.next();
            String[] v = s.split("");
            int c = 0;
            for (int i = 0; i < v.length; i++) {
                if (h.contains(v[i])){
                    c+= Integer.parseInt(v[i]);
                }
            }
            System.out.println(c);
        }
    }
}
