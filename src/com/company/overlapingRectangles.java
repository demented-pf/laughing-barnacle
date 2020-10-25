
import java.util.Scanner;


class overlapingRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int oneX1 = input.nextInt();
            int oneY1 = input.nextInt();
            int oneX2 = input.nextInt();
            int oneY2 = input.nextInt();
            int twoX1 = input.nextInt();
            int twoY1 = input.nextInt();
            int twoX2 = input.nextInt();
            int twoY2 = input.nextInt();
            boolean g = false;
            if (oneX2<=twoX1){
                System.out.println(0);
                g = true;
            }
            else if (twoX2<=oneX1 && !g){
                System.out.println(0);
                g= true;
            }

            if (twoY1<=oneY2 && !g){
                System.out.println(0);
                g = true;
            }
            else if (oneY1<=twoY2 && !g){
                System.out.println(0);
                g = true;
            }
            else if (!g){
                System.out.println(1);
            }
        }
    }
}