

import java.util.Scanner;

public class littleElephantsAndBombs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = input.nextInt();
            String[] h = new String[n];
            String s = input.next();
            h = s.split("");
            int k = 1;
            int counter = 0;

            if (n == 1 && h[0].equals("1")){
                System.out.println(0);
                continue;
            }
            if (n == 1 && h[0].equals("0")){
                System.out.println(1);
                continue;
            }

            if (h[1].equals("0") && h[0].equals("0")){
                counter ++;
            }
            for (int j = 1; j < n - 1; j++) {
                if (h[j].equals("0") && h[j-1].equals("0") && h[j+1].equals("0")){
                    counter++;
                }
            }
            if (h[n-1].equals("0") && h[n-2].equals("0")){
                counter ++;
            }
            System.out.println(counter);
        }
    }
}
