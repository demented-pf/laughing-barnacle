

import java.util.Scanner;

public class LuckyLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();
        while (tests-- > 0){
            String s = input.next();
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '4' && s.charAt(i) != '7'){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}

