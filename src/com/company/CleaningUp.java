package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CleaningUp {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        for (int i = 0; i < tests; i++) {
            int numJobs = input.nextInt();
            int jobsDone = input.nextInt();

            Set<Integer> h = new HashSet<>();
//            Set<Integer> c = new HashSet<>();
//            Set<Integer> a = new HashSet<>();

            for (int j = 0; j < jobsDone; j++) {
                int k = input.nextInt();
                h.add(k);
            }

            boolean cook = true;
//            for (int j = 1; j < numJobs + 1; j++) {
//                if (!h.contains(j)) {
//                    if (cook){
//                        c.add(j);
//                        cook = false;
//                    }
//                    else {
//                        a.add(j);
//                        cook = true;
//                    }
//                }
//            }
            StringBuilder theC = new StringBuilder();
            StringBuilder theA = new StringBuilder();
            for (int j = 1; j < numJobs + 1; j++) {
                if (!h.contains(j)) {
                    if (cook){
                        theC.append(j).append(" ");
                        cook = false;
                    }
                    else {
                        theA.append(j).append(" ");
                        cook = true;
                    }
                }
            }


            System.out.println(theC);
            System.out.println(theA);
        }
    }
}
