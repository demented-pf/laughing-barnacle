package com.company;

import java.util.Scanner;

public class IsPrime {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        for (int i = 0; i < test; i++) {
            int start = input.nextInt();
            int end = input.nextInt();
            for (int j = start; j < end+1; j++) {
                boolean g = true;
                for (int k = 2; k < (int) Math.sqrt(j)+1; k++) {
                    if (j % k == 0){
                        g = false;
                        break;
                    }
                }
                if (g == true && j != 1){
                    System.out.println(j);
                }
            }
            System.out.print("\n");
        }
    }
}
