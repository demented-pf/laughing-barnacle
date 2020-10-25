import java.util.Hashtable;
import java.util.Scanner;

public class HorseShoeColor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer, Integer> h = new Hashtable<>();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int g = input.nextInt();
            if (h.containsKey(g)){
                sum+=1;
            }
            else{
                h.put(g, 1);
            }
        }
        System.out.println(sum);
        
    }
    
}
