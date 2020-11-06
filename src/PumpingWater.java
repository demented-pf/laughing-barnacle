

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PumpingWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test -- > 0){
            int counter = 0;
            List<Integer> h = new ArrayList<>();
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                h.add(input.nextInt());
            }
            while (n > 1){
                int g = findGreatest(h, n);
                if (n - g > g){
                    h.removeAll(h.subList(g, n));
                    n -= n - g;
                }
                else {
                    h.removeAll(h.subList(0,g+1));
                    n -= g+1;
                }
                counter ++;
            }
            System.out.println(counter);
        }
    }
    public static int findGreatest(List<Integer> h, int n){
        int g = 0;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(h.get(i) + " " + h.get(g));
            if (h.get(i) > h.get(g)){
                g = i;
            }
        }
        System.out.println("\n");
        return g;
    }
}
