package DynamicPrograming;

import java.util.Arrays;

public class AddFirstNNumbers {
    public static void main(String[] args) {
        AddFirstNNumbers h = new AddFirstNNumbers();
        System.out.println(h.addSecond(3));
    }
    public int addFirst(int n){
        int[] h = new int[n + 1];
        h[0] = 0;

        for (int i = 1; i <= n; i++) {
            h[i] = h[i - 1] + i;
        }

        return h[n];
    }

    public int addSecond(int n){
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number += i;
        }
        return number;
    }
}
