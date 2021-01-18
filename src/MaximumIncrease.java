import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int c = 0;
        int tc = 0;
        int oldN = 0;
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            if (i == 0){
                c ++;
            }
            else if (n > oldN){
                c++;
            }
            else {
                tc = Math.max(c, tc);
                c = 1;
            }
            oldN = n;
        }
        tc = Math.max(c, tc);
        System.out.println(tc);
    }
}
