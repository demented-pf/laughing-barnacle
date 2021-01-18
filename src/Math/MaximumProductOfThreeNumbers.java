package Math;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int product = 1;
        Arrays.sort(nums);
        product *= nums[nums.length - 1];
        product *= nums[nums.length - 2];
        product *= nums[nums.length - 3];
        return product;
    }
}
