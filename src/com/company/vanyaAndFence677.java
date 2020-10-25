

import java.util.Scanner;

public class vanyaAndFence677 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPeople = input.nextInt();
        int fenceHeight = input.nextInt();
        int width = 0;
        for (int i = 0; i < numPeople; i++) {
            int height = input.nextInt();
            if (height > fenceHeight){
                width += 2;
            }
            else {
                width += 1;
            }
        }
        System.out.println(width);
        input.close();
    }
}
