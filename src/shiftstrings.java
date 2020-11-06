/* package codechef; // don't place package name! */
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
class shiftstrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw;
    static StringTokenizer st;

    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int n = Integer.parseInt(next());
        String a = next();
        String b = next();
        b = b + b;

        int[] lps = lps(a);
        int ans = KMP(a, b, lps);

        System.out.println(ans);
    }

    static int[] lps(String s) {
        int M = s.length();
        int lps[] = new int[M];

        lps[0] = 0;
        int len = 0;
        int i = 1;

        while (i < M) {
            if (s.charAt(i) == s.charAt(len)) {     //when ith and len th char are matching
                len++;
                lps[i] = len;
                i++;
            } else {                      //when ith and len th char are not matching
                if (len != 0) {             //when len != 0
                    len = lps[len - 1];
                } else {                      //when len = 0
                    lps[len] = len;
                    i++;
                }
            }
        }
        return lps;
    }

    static int KMP(String pat, String txt, int[] lps) {
        int patLength = pat.length();
        int txtLength = txt.length();
        int txtIndex = 0;      //ind of txt[]
        int patIndex = 0;      //ind of pat[]

        int max = 0;        //to update the max match in txt and pat
        int pos = 0;        //to get the pos of patIndex and get the min no of shift(when max match occur)


        //txt = "abcde"
        //pat = "abcef"
        // lps = [0, 0, 0, 0, 0]

        while (txtIndex < txtLength) { // 1 < 4 , 2 < 4, 3 < 4, 4 !< 4
            if (pat.charAt(patIndex) == txt.charAt(txtIndex)) { // a == a , b == b, c == c, a != d
                txtIndex++; //1 , 2, 3
                patIndex++;  // 1 ,2, 3
            }
            if (patIndex > max) { // 1> 0,2 > 1, 3 > 2, 0 !> 3
                max = patIndex; // max = 1 , max = 2, max = 3
                pos = txtIndex - patIndex; // pos = 1-1 , 2 - 2 = 0, 3 - 3 = 0
            }

            if (patIndex == patLength) { // 1 != 3, 2 != 3, 3 != 4, 0 != 4
                patIndex = lps[patIndex - 1]; //
            } else if (txtIndex < txtLength &&
                    pat.charAt(patIndex) != txt.charAt(txtIndex))
                //1 < 4 && b == b,
                // 2 < 4 && c == c , 3 < 4 d != e, 3 < 4 && a != d
            {
                if (patIndex != 0) { // 3 != 0,
                    patIndex = lps[patIndex - 1]; // lps[3 - 1 = 2] patIndex = 0
                } else { //when patIndex=0,      0 == 0
                    txtIndex ++; //txtIndex = 4
                }
            }


        }
        return pos;
    }
}

