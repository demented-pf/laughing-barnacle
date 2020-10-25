import java.util.Arrays;
import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String one = input.nextLine();
        String two = input.next();
        String[] listOne = one.split(" ");
        String[] listTwo = two.split("");
        int sum = 0;
        for (int i = 0; i < listTwo.length; i++) {
            if (listTwo[i].equals("1")){
                sum += Integer.parseInt(listOne[0]);
            }
            if (listTwo[i].equals("2")){
                sum += Integer.parseInt(listOne[1]);
            }
            if (listTwo[i].equals("3")){
                sum += Integer.parseInt(listOne[2]);
            }
            if (listTwo[i].equals("4")){
                sum += Integer.parseInt(listOne[3]);
            }
        }
        System.out.println(sum);
        input.close();
    }
}
