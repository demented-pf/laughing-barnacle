

import java.util.Scanner;

public class WalkOnTheAxis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0){
            long a = input.nextInt();
            long b = a + ((a*(a+1))/2);
            System.out.println(b);
        }
    }
}
