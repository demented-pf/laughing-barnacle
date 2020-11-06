

import java.util.Scanner;

public class BytelandianGoldCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLong()){
            long sum = 0;
            long num = input.nextInt();
            sum += num / 2;
            sum += num / 3;
            sum += num / 4;
            if (sum < num){
                System.out.println(num);
            }
            else {
                System.out.println(sum);
            }
        }
    }
}
