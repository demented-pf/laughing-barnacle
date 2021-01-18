package ProjectEuler;

import java.util.Scanner;

public class NumberSixSumSquareDif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            Long n = in.nextLong();
            long sum = (n * (n+1) * (2* n +1))/6;
            long sumOfEachAndSquare = (long)Math.pow((n * (n + 1)) / 2, 2);
            System.out.println(sumOfEachAndSquare - sum);
        }
    }
}

