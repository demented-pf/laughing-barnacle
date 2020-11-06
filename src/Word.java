import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String g = input.nextLine();
        String[] s = g.split("");
        int capitalCounter = 0;
        for (String t : s) {
            if (t.charAt(0) - 'a' < 0){
                capitalCounter += 1;
            }
        }
        if (capitalCounter <= s.length/2){
            System.out.println(g.toLowerCase());
        }
        else{
            System.out.println(g.toUpperCase());
        }
        input.close();
            
        
    }
}
