

import java.util.Scanner;

public class AntonAndDanik734 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numGames = input.nextInt();
        String theInput = input.next();
        int A = 0;
        int D = 0;
        String[] c = theInput.split("");
        for (int i = 0; i < numGames; i++) {
            if (c[i].equals("A")) {
                A++;
                continue;
            }
            D ++;
        }
        if (A > D) System.out.println("Anton");
        else if (A < D) System.out.println("Danik");
        else System.out.println("Friendship");
        input.close();
    }
}
