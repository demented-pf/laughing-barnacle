import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int burles = input.nextInt();
        int coin = input.nextInt();
        int i = 1;
        while (true){
            if ((burles*i)%10 == coin || (burles*i)%10 == 0){
                System.out.println(i);
                break;
            }
            
            i++;
        }
    }
}
