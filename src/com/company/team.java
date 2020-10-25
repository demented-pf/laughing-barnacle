import java.util.Scanner;
public class team {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final int numOfProblems = input.nextInt();
        int answer = 0;
        for (int i = 0; i < numOfProblems; i++) {
            int counter = 0;
            final int one = input.nextInt();
            final int two = input.nextInt();
            final int three = input.nextInt();
            if (one == 1) counter ++;
            if (two == 1) counter ++;
            if (three == 1) counter ++;
            if (counter >= 2) answer ++;
        }
        System.out.println(answer);
        input.close();
    }
    
}
