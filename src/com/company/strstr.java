package com.company;

import java.util.Arrays;

public class strstr {
    public int strStr(String haystack, String needle) {
        return KMPSearch(needle, haystack);
    }



    int KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();

        int pos[] = new int[M];
        computeLPSArray(pat, M, pos);
        System.out.println(Arrays.toString(pos));
        int i = 0;
        int j = 0;
        int c = 0;
        int thePos = 0;
        int counter = 0;
        for (int m = 0; m < N; m++) {
            if (txt.charAt(i) == pat.charAt(j)){
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
                while (txt.charAt(i) != pat.charAt(j) && i < pat.length()){
                    if (txt.charAt(i) == pat.charAt(j)){
                        break;
                    }
                    if (txt.charAt(i) != pat.charAt(j) && j != 0){
                        j = pos[j - 1];
                    }
                    else {
                        i ++;
                    }
                }
            }
            if (counter == M){
                return thePos - 1;
            }
        }
        return -1;

    }

    void computeLPSArray(String pat, int lengthOfPattern, int pos[])
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
    public static void main(String args[])
    {
        String txt = "aaaaa";
        String pat = "bba";
        new kmpGeeksForGeeks().KMPSearch(pat, txt);
    }
}
