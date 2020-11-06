

import java.util.Arrays;
import java.util.Scanner;

public class maximumWeightDifference {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int m = 0; m < test; m++) {

            int numN = input.nextInt();
            int OGH = input.nextInt();
            int[] numbers = new int[numN];
            for (int i = 0; i < numN; i++) {
                numbers[i] = input.nextInt();
            }
            if (OGH > numN - OGH) {
                OGH = numN - OGH;
            }
            Arrays.sort(numbers);
            int small = 0;
            int big = 0;
            for (int j = 0; j < OGH; j++) {
                small += numbers[j];
            }
            for (int j = OGH; j < numN; j++) {
                big += numbers[j];
            }
            System.out.println(Math.abs(big - small));
        }
    }
}
