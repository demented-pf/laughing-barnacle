import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().toLowerCase();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' || s.charAt(i) == 'y')){
                result += s.charAt(i);
            }
        }
        String newResult = "";
        for (int i = 0; i < result.length(); i++) {
            newResult += "." + result.charAt(i);
        }
        System.out.println(newResult);
    }
}
