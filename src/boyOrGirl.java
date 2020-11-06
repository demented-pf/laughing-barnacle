import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        HashSet<String> h = new HashSet<>();
        int counter = 0;
        for (String s : n.split("")) {
            if (!h.contains(s)){
                h.add(s);
                counter ++;
            }

        }
        if (counter % 2 == 1){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
        input.close();
    }
    
}
