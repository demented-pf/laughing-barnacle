package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class WhereAmI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumberOfLetters = input.nextInt();
        String TheWord = input.next();
        String[] letters = TheWord.split("");
        Hashtable<String, Integer> h = new Hashtable<>();

        for (int k = 0; k < NumberOfLetters + 1; k++) {
            for (int i = 0; i < NumberOfLetters + 1; i++) {
                String v = "";
                for (int j = k; j < i; j++) {
                    v += letters[j];
                }
                String[] y = v.split("");

                for (int e = 0; e < y.length; e++) {
                    String t = "";
                    for (int j = e; j < y.length; j++) {
                        t += y[j];
                    }
                    if (h.containsKey(t)) {
                        int g = h.get(t);
                        h.replace(t, g, g + 1);
                    } else {
                        h.put(t, 1);
                    }
                }

            }
        }

        List<String> x = new ArrayList<>();
        List<Integer> u = new ArrayList<>();
        for (int k = 0; k < NumberOfLetters + 1; k++) {
            for (int i = 0; i < NumberOfLetters + 1; i++) {
                String v = "";
                for (int j = k; j < i; j++) {
                    v += letters[j];
                }
                String[] y = v.split("");

                for (int e = 0; e < y.length; e++) {
                    String t = "";
                    for (int j = e; j < y.length; j++) {
                        t += y[j];
                    }

                    if (h.get(t) == 1) {
                        u.add(i);
                        x.add(t);
                    }
                }
            }
        }
        System.out.println(u);
        for (int i = 0; i <= u.size(); i++) {
            String[] r = x.get(i).split("");
            Hashtable<String, Integer> n = new Hashtable<>();
            for (int j = 0; j < r.length; j++) {
                if (n.containsKey(r[j])){
                    u.remove(i);
                    break;
                }
                else {
                    n.put(r[j], 1);
                }
            }
        }

        System.out.println(u +" "+ x);
    }
}
