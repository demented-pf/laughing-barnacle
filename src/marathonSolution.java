

import java.io.*;
import java.util.*;
public class marathonSolution {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {

            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }
        int totalDistance = 0;
        for(int i = 1; i < n; i++) {
            totalDistance += Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
        }
        int largestSkip = 0;
        for(int i = 1; i < n-1; i++) {
            int noSkipDistance = Math.abs(x[i+1] - x[i]) + Math.abs(x[i] - x[i-1]) + Math.abs(y[i+1] - y[i]) + Math.abs(y[i] - y[i-1]);
            int skipDistance = Math.abs(x[i+1] - x[i-1]) + Math.abs(y[i+1] - y[i-1]);
            largestSkip = Math.max(largestSkip, noSkipDistance - skipDistance);
        }
        System.out.println(totalDistance);
        System.out.println(totalDistance - largestSkip);
    }
}