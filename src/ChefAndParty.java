

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            int n = input.nextInt();
            int[] h = new int[n];
            for (int j = 0; j < n; j++) {
                h[j] = input.nextInt();
            }
            Arrays.sort(h);
            if (h[0] == 0){
                int counter = 1;
                boolean g = true;
                for (int j = 1; j < n; j++) {
                    if (h[j] <= counter){
                        counter ++;
                    }
                    else {
                        System.out.println(counter);
                        g = false;
                        break;
                    }
                }
                if (g){
                    System.out.println(counter);
                }
            }
            else {
                System.out.println(0);
            }
        }
    }
}
