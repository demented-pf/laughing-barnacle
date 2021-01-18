package AdventOfCode.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number1 {
    public static void main(String[] args) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("/Users/nathannaveen/IdeaProjects/codeforces/src/AdventOfCode/day4/input1");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int totalCounter = 0;
        List<String> g = new ArrayList<>();
        String s = "";
        while ((strLine = br.readLine()) != null)   {
            if (strLine.length() == 0){
                g.add(s);
                s = "";
            }
            else{
                if (s.equals("")){
                    s += strLine;
                }
                else {
                    s += " " + strLine;
                }
            }
        }
        System.out.println(first(g));
        fstream.close();
    }
    public static int first(List<String> h){
        String[] g = new String[h.size()];
        for (int i = 0; i < g.length; i++) {
            g[i] = h.get(i);
        }

        int numProperPassport = 0;

        for (int i = 0; i < g.length; i++) {
            String[] c = g[i].split(" ");
            Arrays.sort(c);
            Boolean[] z = new Boolean[8];
            String[][] v = new String[8][];
            int k = 0;
            for (int j = 0; j < c.length; j++) {
                v[j] = c[j].split(":");
            }
            if (c.length > 6) {
                if (v[0][0].equals("byr")) z[0] = true;
                else z[0] = false;
                if (v[1][0].equals("cid")) z[1] = true;
                else {
                    z[1] = false;
                    k = -1;
                }
                if (v[2 + k][0].equals("ecl")) z[2] = true;
                else z[2] = false;
                if (v[3 + k][0].equals("eyr")) z[3] = true;
                else z[3] = false;
                if (v[4 + k][0].equals("hcl")) z[4] = true;
                else z[4] = false;
                if (v[5 + k][0].equals("hgt")) z[5] = true;
                else z[5] = false;
                if (v[6 + k][0].equals("iyr")) z[6] = true;
                else z[6] = false;
                if (v[7 -1][0].equals("pid")) z[7] = true;
                else z[7] = false;
            }
            else {
                continue;
            }
            int counter = 0;
            for (int j = 0; j < 8; j++) {
                if (j != 1){
                    if (z[j]){
                        counter ++;
                    }
                }
            }
            if (counter == 7){
                numProperPassport ++;
            }
        }
        return numProperPassport;
    }

}
