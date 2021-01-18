package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecompressRLEL {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                h.add(nums[i + 1]);
            }
        }
        System.out.println(h.toString());
        int[] n = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            n[i] = h.get(i);
        }
        return n;
    }
}
