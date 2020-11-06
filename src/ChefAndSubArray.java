

import java.util.Scanner;

public class ChefAndSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long k = input.nextInt();
        long tCounter = 0;
        long counter = 0;
        for (int i = 0; i < k; i++) {
            long n = input.nextInt();
            if (n == 0){
                if (tCounter < counter){
                    tCounter = counter;
                }
                counter = 0;
            }
            else {
                counter ++;
            }
        }
        if (tCounter < counter){
            tCounter = counter;
        }
        System.out.println(tCounter);
    }
}
