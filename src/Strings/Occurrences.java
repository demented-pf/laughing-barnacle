package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Occurrences {
    public String[] findOcurrences(String text, String first, String second) {
        String[] h = text.split(" ");
        List<String> l = new ArrayList<>();
        for (int i = 0; i < h.length - 2; i++) {
            if (h[i].equals(first) && h[i+1].equals(second)){
                l.add(h[i + 2]);
            }
        }
        String[] res = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        return res;
    }
}
