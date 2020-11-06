import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numCrimes = 0;
        int officers = 0;
        for (int i = 0; i < n; i++) {
            int g = input.nextInt();
            if (g==-1 && officers ==0){
                numCrimes ++;
            }
            else if (g==-1 && officers !=0){
                officers -= 1;
            }
            else if (g != -1){
                officers += g;
            }
        }
        System.out.println(numCrimes);
        input.close();
    }
}
