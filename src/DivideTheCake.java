

import java.util.Scanner;

public class DivideTheCake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = input.nextInt();

            if (360 % n == 0){
                System.out.print("y ");
            }
            else {
                System.out.print("n ");
            }
            if (n <= 360){
                System.out.print("y ");
            }
            else {
                System.out.print("n ");
            }
            if ((n*(n+1))/2 <=360){
                System.out.print("y\n");
            }
            else {
                System.out.print("n\n");
            }
        }
    }
}
