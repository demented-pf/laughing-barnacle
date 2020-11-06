

import java.util.Scanner;

public class chefAndFeedback {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test -- > 0){
            String s = input.next();
            boolean g = false;
            if (s.equals("101") || s.equals("010")){
                System.out.println("Good");
                g = true;
            }

            for (int i = 0; i < s.length() - 3; i++) {
                if ((s.charAt(i) == '0' && s.charAt(i+1) == '1' && s.charAt(i+2) == '0')||
                        (s.charAt(i) == '1' && s.charAt(i+1) == '0' && s.charAt(i+2) == '1')){
                    System.out.println("Good");
                    g = true;
                    break;
                }
            }
            if (!g){
                System.out.println("Bad");
            }
        }
    }
}
