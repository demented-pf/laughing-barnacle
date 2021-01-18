package Sort;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        SortedMap<Integer, Integer> l = new TreeMap<>();
        int min = Integer.MAX_VALUE;

        for (int n : nums){
            if (l.containsKey(n)) l.replace(n, l.get(n) + 1);
            else l.put(n, 1);
        }
        System.out.println(l.toString());
        return new int[]{};
    }
}
