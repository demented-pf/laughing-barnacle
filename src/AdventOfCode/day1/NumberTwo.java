package AdventOfCode.day1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumberTwo {
    public static void main(String[] args) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("/Users/nathannaveen/IdeaProjects/codeforces/src/AdventOfCode/input1");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        List<Integer> h = new ArrayList<>();
        while ((strLine = br.readLine()) != null)   {
            h.add(Integer.parseInt(strLine));
            System.out.println (strLine);
        }
        int[] g = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            g[i] = h.get(i);
        }

        taco(g);

        fstream.close();
    }
    public static int taco(int[] h){
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h.length; j++) {
                for (int k = 0; k < h.length; k++) {
                    if (h[i] + h[k] + h[j] == 2020){
                        System.out.println(h[i] * h[k] * h[j]);
                        return h[i] * h[k] * h[j];
                    }
                }
            }
        }
        return -1;
    }
}
