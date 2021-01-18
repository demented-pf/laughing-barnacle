package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> h = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> n = new ArrayList<>();
                    if ((nums[i] + nums[j] + nums[k]) == 0){
                        n.add(nums[i]); n.add(nums[j]); n.add(nums[k]);
                        Collections.sort(n);
                        if (!h.contains(n)) {
                            h.add(n);
                        }
                    }
                }
            }
        }

        return h;
    }
}
