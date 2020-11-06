

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        for (int i = 0; i < tests; i++) {
            int num = input.nextInt();
            int nNum = num;
            int counter = 5;
            int sum = 0;
            while (nNum>1){
                nNum = num;
                sum += nNum/counter;
                nNum /= counter;
                counter *= 5;
            }
            System.out.println(sum);
        }
    }
}
