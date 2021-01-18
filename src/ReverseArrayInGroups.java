import java.util.ArrayList;

public class ReverseArrayInGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        if (k > n){
            k = n;
        }
        int end = k-1;
        int start = 0;
        int kCounter = 1;
        while (end < n){
            for (int i = 0; i < k / 2; i++) {
                int g = arr.get(end);
                arr.set(end, arr.get(start));
                arr.set(start, g);
                start++;
                end--;
            }
            start = kCounter * k;
            end = start + k - 1;
            kCounter++;
        }
        end = n -1;
        for (int i = start; i < start + (n-start)/2; i++) {
            int g = arr.get(end);
            arr.set(end, arr.get(start));
            arr.set(start, g);
            start++;
            end--;
        }
    }
}
