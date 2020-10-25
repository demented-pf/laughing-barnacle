package com.company;

import java.util.Scanner;

public class countSubstrings {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        long tests = input.nextInt();
        for (int i = 0; i < tests; i++) {
            long n = input.nextInt();
            long counter =0;
            String g = input.next();
            for (int j = 0; j < n; j++) {
                if (g.charAt(j) == '1'){
                    counter ++;
                }

            }
            System.out.println((counter * (counter + 1))/2);
        }
    }
}
