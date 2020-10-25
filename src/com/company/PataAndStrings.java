import java.util.Scanner;
public class PataAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine().toLowerCase();
        String second = input.nextLine().toLowerCase();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)){
                if (first.charAt(i) < second.charAt(i)){
                    System.out.println(-1);
                    return;
                }
                else{
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
        
        input.close();
    }
}

        