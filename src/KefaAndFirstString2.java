

import java.util.Scanner;

public class KefaAndFirstString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] h = new int[num];
        for (int i = 0; i < num; i++) {
            h[i] = input.nextInt();
        }
        int counter = 1;
        int totalCounter = 0;
        for (int i = 1; i < num; i++) {
            if (h[i-1] <= h[i]){
                counter += 1;
            }
            else {
                if (totalCounter < counter){
                    totalCounter = counter;
                }
                counter = 1;
            }
        }
        if (totalCounter < counter){
            totalCounter = counter;
        }
        System.out.println(totalCounter);
    }
}
