package Sort;

import java.util.Arrays;
import java.util.Set;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        int[] h = new int[26];
        StringBuilder n = new StringBuilder();

        for (char m : s.toCharArray()){
            h[((int) m) - 'a'] ++;
        }

        while (n.length() != s.length()){
            for (int j = 0; j < h.length; j++) {
                if (h[j] != 0){
                    n.append((char) (j + 'a'));
                    h[j] --;
                }
            }
            for (int j = h.length - 1; j >= 0; j--) {
                if (h[j] != 0){
                    n.append((char) (j + 'a'));
                    h[j] --;
                }
            }
        }

        return n.toString();
    }
}
