import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class distributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candies = new HashSet<>();
        int num = -1;
        for (int i : candyType){
            if (num != i){
                if (candies.size() + 1 > candyType.length/2){
                    break;
                }
                if (!candies.contains(i)) {
                    candies.add(i);
                    num = i;
                }
            }
        }
        return candies.size();
    }
}
