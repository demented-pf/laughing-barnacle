package Arrays;

import java.util.Arrays;

public class MaximizeSimOfArrayAfterKNegations {
    public static void main(String[] args) {
        MaximizeSimOfArrayAfterKNegations h = new MaximizeSimOfArrayAfterKNegations();
        System.out.println(h.largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
    }
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        Arrays.sort(A);

        for (int i = 0; i < K; i++) {
            A[0] *= -1;
            if (A[0] > A[1]) Arrays.sort(A);
        }

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}
