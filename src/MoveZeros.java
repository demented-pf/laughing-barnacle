import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros h = new MoveZeros();
        h.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
    public void moveZeroes(int[] nums) {
        int h = 0;
        int g = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                g = nums[h];
                nums[h] = nums[i];
                nums[i] = g;
                h++;
            }
        }
    }
}
