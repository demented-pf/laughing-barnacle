package Math;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs h = new ClimbingStairs();
        System.out.println(h.climbStairs(4));
    }
    public int climbStairs(int n) {
        if (n <= 2){
            return n;
        }

        int num = 1;
        int old = 1;
        int replacer = 0;

        for (int i = 2; i <= n; i++) {
            replacer = old;
            old = num;
            num += replacer;
        }
        return num;
    }
}
