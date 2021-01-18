package Strings;

import java.util.HashMap;
import java.util.Set;

public class MinAnagramToStrings {
    public int minSteps(String s, String t) {
        int[] first = new int[26];
        int[] second = new int[26];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i) - 97] += 1;
            second[t.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < 26; i++) {
            sum += Math.abs(first[i] - second[i]);
        }
        return sum / 2;
    }
}























//        HashMap<Character, Integer> first = new HashMap<>();
//        HashMap<Character, Integer> second = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (first.containsKey(s.charAt(i))){
//                int g = first.get(s.charAt(i)) + 1;
//                first.replace(s.charAt(i), g);
//            }
//            else {
//                first.put(s.charAt(i), 1);
//            }
//
//            if (second.containsKey(t.charAt(i))){
//                int g = second.get(t.charAt(i)) + 1;
//                second.replace(t.charAt(i), g);
//            }
//            else {
//                second.put(t.charAt(i), 1);
//            }
//        }
//        int sum = 0;
//        for (char i : first.keySet()){
//            if (second.containsKey(i)){
//                sum += Math.abs(second.get(i) - first.get(i));
//            }
//            else {
//                sum += first.get(i);
//            }
//        }
////        for (char i : second.keySet()){
////            if (first.containsKey(i)){
////                sum += Math.abs(second.get(i) - first.get(i));
////            }
////            else {
////                sum += second.get(i);
////            }
////        }
//        return sum/2;