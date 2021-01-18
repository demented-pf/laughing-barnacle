public class differenceInCircularArray {
    public static int minAdjDiff(int arr[], int n) {
        int g = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int h = g;
            g = Math.min(Math.abs(arr[i] - arr[i+1]), h);
        }
        int h = g;
        g = Math.min(Math.abs(arr[0] - arr[n - 1]), h);
        return g;
    }
}
