package Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        KthMissingPositiveNumber h = new KthMissingPositiveNumber();
        System.out.println(h.findKthPositive(new int[]{1, 2}, 1));
    }

    public int findKthPositive(int[] arr, int k) {
        int counter = 0;
        int totalCounter = 1;
        int i = 0;
        while (counter != k) {
            if (arr.length > i){
                if (arr[i] != totalCounter){
                    System.out.println(arr[i]);
                    counter ++;
                    totalCounter ++;
                }
                else if (arr[i] == totalCounter){
                    i ++;
                    totalCounter ++;
                }
            }
            else {
                counter ++;
                totalCounter ++;
            }
        }
        return totalCounter - 1;
    }
}
