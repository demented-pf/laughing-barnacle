import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfNumbers {
    public static void main(String[] args) {
        UniqueNumberOfNumbers h = new UniqueNumberOfNumbers();
        h.uniqueOccurrences(new int[]{1,2,2,1,1,3});
    }
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> h = new HashSet<>();
        Arrays.sort(arr);
        int num = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]){
                if (h.contains(counter)){
                    return false;
                }
                h.add(counter);
                num = arr[i];
                counter = 1;
            }
            else {
                counter ++;
            }
        }
        if (h.contains(counter)){
            return false;
        }
        return true;
    }
//    public boolean uniqueOccurrences(int[] arr) {
//        HashMap<Integer, Integer> h = new HashMap<>();
//        for (int n : arr){
//            if (h.containsKey(n)){
//                h.replace(n, h.get(n) + 1);
//            }
//            else {
//                h.put(n, 1);
//            }
//        }
//        for (int first : h.keySet()){
//            boolean occurrence = false;
//            for (int second : h.keySet()){
//                if (h.get(first) == h.get(second)){
//                    if (occurrence){
//                        return false;
//                    }
//                    occurrence = true;
//                }
//            }
//        }
//        return true;
//    }
}
