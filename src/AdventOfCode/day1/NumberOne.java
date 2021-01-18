package AdventOfCode.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOne {
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

        multiplySumsTo2020(g);

        fstream.close();
    }
    public static int multiplySumsTo2020(int[] h){
        Arrays.sort(h);
        int product = 1;
        int left = 0;
        int right = h.length - 1;
        while (h[left] + h[right] != 2020){
            if (h[left] + h[right] < 2020){
                left ++;
            }
            if (h[left] + h[right] > 2020){
                right --;
            }
            if (h[left] + h[right] == 2020){
                product = h[left] * h[right];
                System.out.println(product);
            }
        }
        return product;
    }
}
