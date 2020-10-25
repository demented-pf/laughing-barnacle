package com.company;

import java.util.*;

public class Chopsticks {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        Arrays.sort(h);
        int counter = 0;
        for (int i = 0; i < n - 1;) {
            if (h[i + 1] - h[i] <= d) {
                counter++;
                i += 2;
                continue;
            }
            i++;
        }
        System.out.println(counter);
    }
}
