import java.util.Scanner;

public class bearAndBigBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int counter = 0;
        while (a <= b){

            counter ++;
            a *= 3;
            b *= 2;
        }
        System.out.println(counter);
        input.close();
    }
}
