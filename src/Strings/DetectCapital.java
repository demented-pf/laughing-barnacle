package Strings;

import javax.swing.plaf.synth.SynthUI;

public class DetectCapital {
    public static void main(String[] args) {
        DetectCapital h = new DetectCapital();
        System.out.println(h.detectCapitalUse("Leetcode"));
    }
    public boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length(); i++) {
            if ((int) word.charAt(i) <= 90 && (int) word.charAt(i) >= 65){
                if ((int) word.charAt(i - 1) > 90 || (int) word.charAt(i - 1) < 65){
                    return false;
                }
            }
            else if (i > 1){
                if ((int) word.charAt(i - 1) <= 90 && (int) word.charAt(i - 1) >= 65){
                    return false;
                }
            }
        }
        return true;
    }
}
