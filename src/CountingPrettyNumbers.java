

import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] h = new int[1000000];
        for (int i = 1; i < 1000000; i++) {
            int result = i %10;
            if (result == 2 || result == 3 || result == 9){
                h[i] = 1;
            }
            else {
                h[i] = 0;
            }
        }
        for (int i = 1; i < 1000000; i++) {
            h[i] += h[i-1];
        }

        long tests = input.nextInt();
        for (long m = 0; m < tests; m++) {
            int start = input.nextInt();
            int end = input.nextInt();
            System.out.println(h[end] - h[start-1]);
        }
    }
}
