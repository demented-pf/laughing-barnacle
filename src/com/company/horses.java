package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class horses {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int numHorses = input.nextInt();
            int[] a = new int[numHorses];

            for (int j = 0; j < numHorses; j++) {
                int g = input.nextInt();
                a[j] = g;
            }
            Arrays.sort(a);
            int least = Integer.MAX_VALUE;
            for (int j = 0; j < numHorses - 1; j++) {
                if (a[j+1] - a[j] < least){
                    least = a[j+1] - a[j];
                }
            }
            System.out.println(least);
        }
    }
}
