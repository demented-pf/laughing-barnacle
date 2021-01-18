package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> h = new ArrayList<>();
        Set<Character> first = new HashSet<>();
        Set<Character> second = new HashSet<>();
        Set<Character> third = new HashSet<>();

        first.add('q'); first.add('w'); first.add('e'); first.add('r'); first.add('t');
        first.add('y'); first.add('u'); first.add('i'); first.add('o'); first.add('p');

        second.add('a'); second.add('s'); second.add('d'); second.add('f'); second.add('g');
        second.add('h'); second.add('j'); second.add('k'); second.add('l');

        third.add('z'); third.add('x'); third.add('c'); third.add('v'); third.add('b');
        third.add('n'); third.add('m');

        for (String word : words){
            int row = -1;
            boolean oneRow = true;
            if (first.contains(word.charAt(0))){
                row = 0;
            }
            else if (second.contains(word.charAt(0))){
                row = 1;
            }
            else {
                row = 2;
            }
            for (char i : word.toCharArray()){
                if (row == 0 && !first.contains(Character.toLowerCase(i))){
                    oneRow = false;
                    break;
                }
                else if (row == 1 && !second.contains(Character.toLowerCase(i))){
                    oneRow = false;
                    break;
                }
                else if (row == 2 && ! third.contains(Character.toLowerCase(i))){
                    oneRow = false;
                    break;
                }
            }

            if (oneRow){
                h.add(word);
            }
        }

        String[] res = new String[h.size()];

        for (int i = 0; i < h.size(); i++) {
            res[i] = h.get(i);
        }
        return res;
    }
}
