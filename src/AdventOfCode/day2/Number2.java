package AdventOfCode.day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number2 {
    public static void main(String[] args) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("/Users/nathannaveen/IdeaProjects/codeforces/src/AdventOfCode/day2/input2");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int totalCounter = 0;
        while ((strLine = br.readLine()) != null)   {
            int h = rooo(strLine);
            if (h == 1){
                totalCounter += 1;
            }
        }
        System.out.println(totalCounter);
        fstream.close();
    }
    public static int rooo(String h){
        String[] s = h.split(" ");
        String[] g = s[0].split("");
        String[] v = s[1].split("");
        String[] f = s[2].split("");
        int num1 = 0;
        int num2 = 0;
        int counter = 0;
        for (int i = 0; i < g.length; i++) {
            counter ++;
            if (g[i].equals("-")){
                break;
            }
            num1 *= 10;
            num1 += Integer.parseInt(g[i]);
        }
        for (int i = counter; i < g.length; i++) {
            num2 *= 10;
            num2 += Integer.parseInt(g[i]);
        }

        String letter = v[0];

        int letterCounter = 0;

        if (f[num1 - 1].equals(letter)){
            letterCounter ++;
        }
        if (f[num2 - 1].equals(letter)){
            letterCounter ++;
        }
        if (letterCounter == 1){
            return 1;
        }
        else {
            return 0;
        }
    }
}