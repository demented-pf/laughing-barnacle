package Strings;

import java.util.HashMap;

public class mostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] h = paragraph.split(" ");
        HashMap<String, Integer> g = new HashMap<>();
        int max = 0;
        String stringMax = "";

        for (int i = 0; i < h.length; i++) {
            String s = "";
            String[] l = h[i].split("");
            for (int j = 0; j < l.length; j++) {
                if (l[j].equals("!") || l[j].equals("?") || l[j].equals("'") || l[j].equals(",") || l[j].equals(";") ||
                        l[j].equals(".")){
                    if (g.containsKey(s)){
                        if (max < g.get(s) + 1){
                            max = g.get(s) + 1;
                            stringMax = s;
                        }
                        g.replace(s, g.get(s) + 1);
                    }
                    else {
                        boolean isBanned = false;
                        for (int t = 0; t < banned.length; t++) {
                            if (banned[t].equals(s)){
                                isBanned = true;
                                break;
                            }
                        }
                        if (!isBanned){
                            g.put(s, 1);
                            if (max < 1){
                                max = 1;
                                stringMax = s;
                            }
                        }
                    }
                    s = "";
                    continue;
                }
                else {
                    s += l[j].toLowerCase();
                }
            }
            if (g.containsKey(s)){
                if (max < g.get(s) + 1){
                    max = g.get(s) + 1;
                    stringMax = s;
                }
                g.replace(s, g.get(s) + 1);
            }
            else {
                boolean isBanned = false;
                for (int t = 0; t < banned.length; t++) {
                    if (banned[t].equals(s)){
                        isBanned = true;
                        break;
                    }
                }
                if (!isBanned){
                    g.put(s, 1);
                    if (max < 1){
                        max = 1;
                        stringMax = s;
                    }
                }
            }
        }

        return stringMax;
    }
}
