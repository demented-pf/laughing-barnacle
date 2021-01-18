import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < q; i++) {
            int which = input.nextInt();
            int start = input.nextInt();
            int end = input.nextInt();
            int c = 0;
            if (which == 1){
                for (int j = start; j < end + 1; j++) {
                    if (h[j] % 3 == 0){
                        c++;
                    }
                }
                System.out.println(c);
            }
            else {
                for (int j = start; j < end + 1; j++) {
                    h[j] += 1;
                }
            }
        }
    }
}
