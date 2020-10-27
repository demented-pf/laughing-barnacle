package com.company;

import java.util.Scanner;

public class shiftTheString {
    public static void main(String[] args) {

    }

    public static int KMP(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String pattern = input.next();

        int patLen = pattern.length();
        int txtLen = text.length();

        int[] pos = new int[patLen];
        compLPS(pattern, patLen, pos);

        int i = 0;
        int j = 0;

        int big = 0;
        int first = 0;

        while (i < txtLen){
            if (pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }
            if (j > big){
                first = i - j;
                big = j;
            }

            if (patLen - 1 == j){
                System.out.println(i - j);
                j = pos[j - 1];
                return first;
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
