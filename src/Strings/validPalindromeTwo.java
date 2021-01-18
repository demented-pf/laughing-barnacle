package Strings;

import java.util.Scanner;
import java.util.Stack;

public class validPalindromeTwo {
    public static void main(String[] args) {
        validPalindromeTwo h = new validPalindromeTwo();
        System.out.println(h.validPalindrome("abc"));
    }
    public boolean validPalindrome(String s) {
        String a = "";
        String b = "";
        Stack<Character> h = new Stack<>();

        if (s.length() % 2 == 0){
            a = s.substring(0, s.length()/2);
            b = s.substring(s.length()/2, s.length());
        }
        else {
            a = s.substring(0, s.length()/2);
            b = s.substring(s.length()/2 + 1, s.length());
        }

        if (a.length() == 1){
            return a.equals(b);
        }

        int bCounter = b.length() - 1;

        for (int i = 0; i < a.length(); i++) {
            h.push(a.charAt(i));
            if (h.get(h.size() - 1) == b.charAt(bCounter)){
                h.pop();
            }

            bCounter --;
        }
        System.out.println(a + " " + b);
        if (h.size() == 1 || h.size() == 0) return true;
        else return false;
    }
}
