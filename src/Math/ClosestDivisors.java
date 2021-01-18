package Math;

public class ClosestDivisors {
    public int[] closestDivisors(int num) {
        int[] h = new int[2];
        for (int i = (int) Math.sqrt(num + 2); i >= 1; i--) {
            if ((num + 2) % i == 0){
                h[0] = i;
                h[1] = (num + 2) / i;
                break;
            }
            if ((num + 1) % i == 0){
                h[0] = i;
                h[1] = (num + 1) / i;
                break;
            }
        }
        return h;
    }
}
