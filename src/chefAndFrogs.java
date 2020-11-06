

import java.util.Scanner;

public class chefAndFrogs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int p = input.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
        }
        for (int i = 0; i < p; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(h[Math.max(b-1, a-1)] - h[Math.min(b-1, a-1)]);
            if (h[Math.max(b-1, a-1)] - h[Math.min(b-1, a-1)] <= k){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
