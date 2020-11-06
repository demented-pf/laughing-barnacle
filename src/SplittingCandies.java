

import java.util.Scanner;

public class SplittingCandies {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            int test = input.nextInt();

            for (int i = 0; i < test; i++) {
                long candies = input.nextLong();
                long students = input.nextLong();
                if (candies != 0 && students != 0){
                    System.out.println(candies / students + " " + candies % students);
                }
                else if (students == 0 && candies != 0){
                    System.out.println(students + " "+ candies);
                }
                else {
                    System.out.println(candies + " " + candies);
                }
            }
        }
        catch (Exception e) {}
    }
}
