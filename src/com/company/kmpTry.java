package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class kmpTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String text = input.next();
//        String pattern = input.next();
        KMP("aaa", "a");
    }

    public static int KMP(String text, String pattern) {
        int patLen = pattern.length();
        int txtLen = text.length();
        int oldPatLen = 0;

        if (patLen == 0){
            return 0;
        }
        int[] pos = new int[patLen];
        compLPS(pattern, patLen, pos);



        if (patLen == 1){
            patLen = 2;
            oldPatLen = 1;
        }
        int i = 0;
        int j = 0;

        while (i < txtLen){
            if (pattern.charAt(j) == text.charAt(i) && i < txtLen - 1){
                i++;
                j++;
            }
            if (patLen == 2 && oldPatLen == 1 && pattern.charAt(j) == text.charAt(i)){
                patLen = 1;
            }
            if (patLen - 1 == j){
                if (text.charAt(i) == pattern.charAt(j)) {
                    System.out.println(i - j);
                    return (i - j);
                }
                else {
                    System.out.println(-1);
                    return -1;
                }
            }
            if (i < txtLen && text.charAt(i) != pattern.charAt(j)){
                if (j != 0){
                    j = pos[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        System.out.println(-1);
        return -1;
    }

    public static void compLPS(String pat, int lengthOfPattern, int pos[])
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
