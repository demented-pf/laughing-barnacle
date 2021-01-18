package Sort;

import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome h = new LongestPalindrome();
        System.out.println(h.longestPalindrome("bb"));
    }
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        boolean middle = false;
        int longest = 0;

        for (char i : s.toCharArray()){
            if (h.containsKey(i)){
                int n = h.get(i) + 1;
                h.replace(i, n);
            }
            else {
                h.put(i, 1);
            }
        }

        System.out.println(h.toString());

        for (Character i : h.keySet()){
            if (h.get(i) % 2 == 1 && !middle){
                middle = true;
                int n = h.get(i) - 1;
                h.replace(i, n);
                longest += 1;
            }
            if (middle || h.get(i) % 2 == 0){
                System.out.println("taco " + h.get(i));
                longest += h.get(i);
                if (h.get(i) % 2 == 1) longest -= 1;
            }
        }
        return longest;
    }
}
