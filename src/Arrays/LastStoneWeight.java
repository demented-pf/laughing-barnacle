package Arrays;

import java.util.Arrays;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight h = new LastStoneWeight();
        System.out.println(h.lastStoneWeight(new int[]{3, 7, 2}));
    }
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int s = 0;
        if (stones.length == 1) return stones[0];
        for (int i = stones.length - 1; i > 0; i--) {
            if (i < stones.length - 1) {
                while (stones[i] != 0) {
                    if (i < stones.length - 1)
                        return s;
                    i--;
                }
            }
            stones[i] -= stones[i - 1];
            s = stones[i];
            System.out.println(Arrays.toString(stones));
        }
        return s;
    }
}
