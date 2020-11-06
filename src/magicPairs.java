

import java.util.Scanner;

public class magicPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        for (int i = 0; i < tests; i++) {
            long n = input.nextInt();
            for (long j = 0; j < n; j++) {
                long g = input.nextInt();
            }

            System.out.println((n * (n - 1))/2);
        }
    }
}
