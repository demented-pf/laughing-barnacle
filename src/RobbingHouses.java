

import java.util.HashSet;
import java.util.Set;

public class RobbingHouses {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
    public static int rob(int[] nums) {
        int sum1 = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum1 += nums[i];
        }
        int sum2 = 0;
        for (int i = 1; i < nums.length; i+=2) {
            sum2 += nums[i];
        }
        return Math.max(sum1, sum2);
    }

}
