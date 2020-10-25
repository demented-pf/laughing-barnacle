import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 1;
        int oldG = 0;
        for (int i = 0; i < n; i++) {
            int g = input.nextInt();
            if (i != 0){
                if (oldG == 01 && g == 10){
                    counter ++;
                }
                if (oldG == 10 && g == 01){
                    counter ++;
                }
            }
            oldG = g;
        }
        System.out.println(counter);
        input.close();
    }
}
