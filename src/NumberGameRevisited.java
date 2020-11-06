

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberGameRevisited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long test = input.nextInt();
        for (long m = 0; m < test; m++) {
            int num = input.nextInt();
            if ((num - 1) % 4 == 0) {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
    }
}
