package com.company;

import java.util.Scanner;

public class chefAndFeedback {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        String pat1 = "101";
        String pat2 = "010";

        int M = 3;
        int N = txt.length();

        int pos[] = new int[M];
        computeLPSArrays(pat1, M, pos);

        int i = 0;
        int j = 0;
        int c = 0;
        int thePos = 0;
        int counter = 0;
        for (int m = 0; m < N - M; m++) {
            if (txt.charAt(i) == pat1.charAt(j)){
                i ++;
                j ++;
                counter++;
                if (c == 0){
                    thePos = i - (j - 1);
                    c++;
                }
            }
            else {
                c = 0;
                while (txt.charAt(i) != pat1.charAt(j)){
                    if (txt.charAt(i) == pat1.charAt(j)){
                        break;
                    }
                    if (txt.charAt(i) != pat1.charAt(j) && j != 0){
                        j = pos[j - 1];
                    }
                    else {
                        i ++;
                    }
                }
            }

        }
        if (counter == M){
            System.out.println("YES");
            return;
        }
        else {
            System.out.println("NO");
        }



        int M2 = pat2.length();
        int N2 = txt.length();

        int pos2[] = new int[M2];
        computeLPSArrays(pat2, M2, pos2);
        i = 0;
        j = 0;
        c = 0;
        thePos = 0;
        counter = 0;
        for (int m = 0; m < N2 - M2; m++) {
            if (txt.charAt(i) == pat2.charAt(j)){
                i ++;
                j ++;
                counter++;
                if (c == 0){
                    thePos = i - (j - 1);
                    c++;
                }
            }
            else {
                c = 0;
                while (txt.charAt(i) != pat2.charAt(j)){
                    if (txt.charAt(i) == pat2.charAt(j)){
                        break;
                    }
                    if (txt.charAt(i) != pat2.charAt(j) && j != 0){
                        j = pos2[j - 1];
                    }
                    else {
                        i ++;
                    }
                }
            }

        }
        if (counter == M2){
            System.out.println("YES");
            return;
        }
        else {
            System.out.println("NO");
        }


    }

    static void computeLPSArrays(String pat, int lengthOfPattern, int pos[])
    {
        int counter = 1;
        int j = 0;

        pos[0] = 0; // pos[0] is always 0

        // the loop calculates pos[i] for i = 1 to M-1
        while (counter < lengthOfPattern){

            if (pat.charAt(counter) == pat.charAt(j)){
                j += 1;
                pos[counter] = j;
                counter += 1;
            }
            else { // (pat[i] != pat[len])

                if (j == 0){
                    pos[counter] = j;
                    counter++;
                }
                else { // if (j != 0)
                    j = pos[j - 1];
                    // Also, note that we do not increment
                    // counter here
                }
            }
        }
    }

}
