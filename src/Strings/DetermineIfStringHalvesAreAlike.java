package Strings;

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        DetermineIfStringHalvesAreAlike h = new DetermineIfStringHalvesAreAlike();
        h.halvesAreAlike("taco");
    }
    public boolean halvesAreAlike(String s) {
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);

        int a = 0;
        int b = 0;

        Set<Character> h = new HashSet<>();
        h.add('a'); h.add('e'); h.add('i'); h.add('o'); h.add('u');
        h.add('A'); h.add('E'); h.add('I'); h.add('O'); h.add('U');


        for (int i = 0; i < first.length(); i++) {
            if (h.contains(first.charAt(i))){
               a ++;
            }
            if (h.contains(second.charAt(i))){
                b ++;
            }
        }
        return a == b;
    }
}
