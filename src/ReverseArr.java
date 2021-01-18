import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArr {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
//        h.add(6);
        ReverseArr g = new ReverseArr();
        g.reverseInGroups(h, 5, 3);
        System.out.println(Arrays.toString(h.toArray()));
    }

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left;
            int right;
            left = i;
            right = Math.min(i + k - 1, n - 1);
            while (left < right){
                int temp = arr.get(right);
                arr.set(right, arr.get(left));
                arr.set(left, temp);
                left ++;
                right --;
            }
        }
    }
}
