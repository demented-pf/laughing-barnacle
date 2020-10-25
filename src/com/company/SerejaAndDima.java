import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        List<Integer> theList = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            int g = input.nextInt();
            theList.add(g);
        }

        int Ssum = 0;
        int Dsum = 0;
        
        for (int i = 0; i < b; i++) {
            int g = 0;

            if (theList.get(0) > theList.get(theList.size()-1)){
                g = theList.get(0);
                theList.remove(0);
            }
            
            else if (theList.get(0) < theList.get(theList.size()-1)){
                g = theList.get(theList.size()-1);
                theList.remove(theList.size()-1);
            }
            
            else if (theList.get(0) == theList.get(theList.size()-1)){
                g = theList.get(theList.size()-1);
            }

            if (i % 2 == 0){
                Ssum += g;
            }
            else{
                Dsum += g;
            }
        }
        
        System.out.println(Ssum + " " + Dsum);
        input.close();
    }
}
