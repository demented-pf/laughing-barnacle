import java.util.Scanner;

public class BeutifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] n = new int[5][5];
        int properNx = 0;
        int properNy = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int g = input.nextInt();
                n[i][j] = g;
                if (g == 1){
                    properNx = i;
                    properNy = j;
                }
            }
        }
        System.out.println(Math.abs(properNx - 2) + Math.abs(properNy - 2));
        input.close();

    }
    
}
