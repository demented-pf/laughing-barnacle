
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicateFromArray {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        int prev = Integer.MAX_VALUE;
        for (int i : nums){
            if (i != prev){
                nums[n++] = i;
                prev = i;
            }
        }
        return n;
    }
}
