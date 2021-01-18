import java.util.Scanner;

public class HitTheLottery{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int c = 0;
        c += num / 100;
        num -= 100*(num/100);
        c += num / 20;
        num -= 20 * (num/20);
        c += num / 10;
        num -= 10 * (num/10);
        c += num / 5;
        num -= 5 * (num/5);
        c += num / 1;
        System.out.println(c);
    }
}
