
import java.util.Arrays;

public class findUniqueNumber {
    public static double findUnique(double arr[]) {
        Arrays.sort(arr);
        if (arr[0] == arr[1]){
            return arr[arr.length-1];
        }
        else {
            return arr[0];
        }
    }
}
