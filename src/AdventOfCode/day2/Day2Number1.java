package AdventOfCode.day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2Number1 {
    class Foo{
        Integer Min;
        Integer Max;
        String Char;
        String Password;
    }
    public static void main(String[] args) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("/Users/nathannaveen/IdeaProjects/codeforces/src/AdventOfCode/day2/input2");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int totalCounter = 0;
        while ((strLine = br.readLine()) != null)   {
            int h = validPassword(strLine);
            totalCounter += h;
        }

        System.out.println(totalCounter);

        fstream.close();
    }

    public static int validPassword(String h){
        String[] s = h.split(" ");
        String[] numSplit = s[0].split("-"); // split by "-" because the thing is two numbers split by a dash
            // Ex: 1-3
        String[] theCharacter = s[1].split("");
        String[] splitPassword = s[2].split("");

        int min = 0;
        int max = 0;

        min = Integer.parseInt(numSplit[0]);
        max = Integer.parseInt(numSplit[1]); // the numbers, the max and min of numbers

        String letter = theCharacter[0]; // the letter is the first in the split Ex: (a:)

        int letterCounter = 0;
        for (int i = 0; i < splitPassword.length; i++) {
            if (splitPassword[i].equals(letter)){ // checking whether the password[i] == the letter
                letterCounter ++;
            }
        }
        if (letterCounter <= max && letterCounter >= min){
            return 1;
        }
        else {
            return 0;
        }
    }
}
