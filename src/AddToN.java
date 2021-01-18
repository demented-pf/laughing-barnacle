import java.util.Arrays;

public class AddToN {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(0));
        System.out.println(add(1));
        System.out.println(add(2));
        System.out.println(add(3));
    }
    public static int add(int n){
        int[] h = new int[n+1];
        h[0] = 0;
        for (int i = 1; i <= n; i++) {
            h[i] = h[i-1] + i;
        }
        return h[n];
    }
}
