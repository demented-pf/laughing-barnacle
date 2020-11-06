import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int y = input.nextInt();
        int n = 7-Math.max(w, y);
        int d = 6;
        for (int i = 1; i < 7; i++) {
            if (n%i ==0 && d%i ==0){
                n /= i;
                d /= i;
            }
        }
        System.out.println(n+"/"+d);

    }
    
}
