import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCakes = input.nextInt();
        int cakeMinutes = input.nextInt();
        int numCakesPerBake = input.nextInt();
        int ovenMakeTime = input.nextInt();
        int totaltime = 0;

        totaltime += numCakes/numCakesPerBake;
        if (numCakes % numCakesPerBake != 0){
            totaltime += 1;
        }

        int extraOvenTime = 0;

        extraOvenTime += ovenMakeTime;
        
    }
}
