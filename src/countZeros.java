

import java.util.Arrays;

public class countZeros {
    int countZeroes(int[] arr, int n) {
        return n - findZeros(arr, 0, n);
    }
    int findZeros(int[] arr, int low, int high){
        if (high >= low){
            var mid = low + (high-low)/2;
            if ((mid == 0||arr[mid-1] == 1)&& arr[mid] == 0){
                return mid;
            }
            if (arr[mid] == 1){
                return findZeros(arr, (mid+1), high);
            }
            else {
                return findZeros(arr, low, (mid-1));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        countZeros c = new countZeros();
        System.out.println(c.countZeroes(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, 12));
    }
}
