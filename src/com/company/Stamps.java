package com.company;

import java.util.Scanner;

public class Stamps {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int stampsNeeded = (n*(n+1))/2;

        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        if (stampsNeeded == sum){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
