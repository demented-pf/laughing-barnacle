import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        Rotate h =  new Rotate();
        h.rotateArr(new int[]{1,2,3,4,5}, 2, 5);
    }
    void rotateArr(int arr[], int d, int n) {
        int[] h = new int[d];
        for (int i = 0; i < h.length; i++) {
            h[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i+d];
        }
        int hCounter = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = h[hCounter];
            hCounter ++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
