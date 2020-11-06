

import java.util.Scanner;

public class SerjaAndVotes {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            int n = input.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += input.nextInt();
            }
            if (sum < 100){
                System.out.println("NO");
            }
            else {
                if (sum - n < 100){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
