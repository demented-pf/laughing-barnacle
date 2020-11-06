import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.substring(1);
        
        s = s.substring(0,s.length()-1);
        if (s.trim().length() == 0) {
            System.out.println(0);
            return;
        }
        String[] g = s.split(", ");
        Hashtable<String, Integer> h = new Hashtable<>();
        int counter = 0;
        for (int i = 0; i < g.length; i++) {
            if (!h.containsKey(g[i])){
                h.put(g[i], 1);
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
