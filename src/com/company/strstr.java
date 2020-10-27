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
        if (M > N){
            return -1;
        }
        if (M == 0){
            return 0;
        }

        int pos[] = new int[M];
        computeLPSArray(pat, M, pos);
        int i = 0;
        int j = 0;
        int counter = 0;

        while (i < N){
            System.out.println(txt.charAt(i) + " " + i + " : " + pat.charAt(j) + " " + j);
            if (txt.charAt(i) == pat.charAt(j)){
                i += 1;
                j += 1;
            }

            if (j == M){
                System.out.println(i - j);
                return i - j;
            }

            else if (pat.charAt(j) != txt.charAt(i) && i < N) {
                if (j == 0 && i + 1 < N){
                    i += 1;
                }
                else {
                    j = pos[j - 1];
                }
            }
        }
        System.out.println(-1);
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
        String txt = "mississippi";
        String pat = "issipi";
        new strstr().KMPSearch(pat, txt);
    }
}
