import java.util.Arrays;
import java.util.Scanner;

public class aStoneOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String h = input.next();
        String[] g = h.split("");
        int counter =0;
        for (int i = 1; i < g.length; i++) {
            if (g[i].equals(g[i-1])){
                counter ++;
            }
        }
        System.out.println(counter);
        input.close();
    }
}
