package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        FirstUniqueCharacter h = new FirstUniqueCharacter();
        System.out.println(h.firstUniqChar("leetcode"));
    }
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        Set<Character> not = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (h.containsKey(s.charAt(i))){
                h.remove(s.charAt(i));
                not.add(s.charAt(i));
            }
            else if (not.contains(s.charAt(i))){
                continue;
            }
            else {
                h.put(s.charAt(i), i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char i : h.keySet()){
            if (h.get(i) < min){
                min = h.get(i);
            }
        }
        for (char i : h.keySet()){
            if (h.get(i) == min){
                return h.get(i);
            }
        }
        return -1;
    }
}
