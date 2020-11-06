

import java.util.Scanner;

public class BuyingSweets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int b = 0; b < test; b++) {

            int num = input.nextInt();
            int price = input.nextInt();
            int sum = 0;
            int counter = 0;
            for (int i = 0; i < num; i++) {
                counter++;
                int g = input.nextInt();
                sum += g;
            }
            if (counter != sum / price && sum % price != 0) {
                System.out.println(-1);
            }
            else if (counter == sum/price || sum%price == 0){
                System.out.println(sum/price);
            }
        }
    }
}
