

import java.util.Arrays;
import java.util.Scanner;

public class AndrewAndMeatBalls {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();
        for (int i = 0; i < tests; i++) {
            int n = input.nextInt();
            long smallest = input.nextInt();
            long[] h = new long[n];
            for (int j = 0; j < n; j++) {
                h[j]=input.nextLong();

            }
            Arrays.sort(h);
            int tots = 0;
            int c = 0;

            while (tots < smallest){
                if (h.length - c < 0){
                    System.out.println(-1);
                    return;
                }
                tots += h[h.length-1 - c];
                c+= 1;
                if (tots >= smallest){
                    System.out.println(c);
                    return;
                }
            }
        }
    }
}
