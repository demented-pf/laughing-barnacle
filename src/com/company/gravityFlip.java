import java.util.Arrays;
import java.util.Scanner;

public class gravityFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            int g = input.nextInt();
            s[i] = g;
        }
        Arrays.sort(s);

        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += s[i] + " ";
        }
        
        System.out.println(result.trim());
        input.close();
        
    }
    
}
