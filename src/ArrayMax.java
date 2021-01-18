import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMax {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        Arrays.sort(arr);
        ArrayList<Integer> h = new ArrayList<>();
        int g = arr[sizeOfArray - 1];
        h.add(g);
        for (int i = sizeOfArray - 2; i >= 0; i--) {
            if (arr[i] != g){
                h.add(arr[i]);
                return h;
            }
        }
        h.add(-1);
        return h;
    }
}
