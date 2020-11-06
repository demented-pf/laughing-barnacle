

import java.util.Arrays;
import java.util.Scanner;

public class horses {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        for (int i = 0; i < test; i++) {
            int numHorses = input.nextInt();
            int least = Integer.MAX_VALUE;
            int[] h = new int[numHorses];
            for (int j = 0; j < numHorses; j++) {
                h[j] = input.nextInt();
            }
            Arrays.sort(h);
            for (int j = 0; j < numHorses-1; j++) {
                int difference = h[j + 1] - h[j];
                if (difference < least){
                    least = difference;
                }
            }
            System.out.println(least);
        }
    }
}
