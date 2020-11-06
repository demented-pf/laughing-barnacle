
import java.util.Scanner;

public class KefaAndFistString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int c = 0;
        int s = 0;
        if (n == 1){
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n; i++) {
            int g = input.nextInt();
            if (i > 0){
                if (g >= s){
                    s = g;
                    c++;
                    if (c > max){
                        max = c;
                    }
                }
                else {
                    if (c > max){
                        max = c;
                    }
                    c = 1;
                    s = g;
                }
            }
            else {
                s = g;
                c ++;
            }
        }
        System.out.println(max);
    }
}
