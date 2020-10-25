package com.company;


import java.util.Arrays;

class kmpGeeksForGeeks {
    void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int pos[] = new int[M];
        computeLPSArray(pat, M, pos);
        System.out.println(Arrays.toString(pos));
        int i = 0; int j = 0; int c = 0;
        int thePos = 0;
        int counter = 0;
        boolean e = false;
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
                while (txt.charAt(i) != pat.charAt(j) && i < txt.length()){
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
                System.out.println(thePos);
                e = true;
                return;
            }

        }
        if (!e){
            System.out.println(-1);
            return;
        }


    }

    void computeLPSArray(String pat, int lengthOfPattern, int pos[])
    {
        int counter = 1;
        int j = 0;

        pos[0] = 0;

        while (counter < lengthOfPattern){

            if (pat.charAt(counter) == pat.charAt(j)){
                j += 1;
                pos[counter] = j;
                counter += 1;
            }
            else {

                if (j == 0){
                    pos[counter] = j;
                    counter++;
                }
                else {
                    j = pos[j - 1];
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