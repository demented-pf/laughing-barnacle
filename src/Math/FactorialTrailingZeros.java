package Math;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        FactorialTrailingZeros h = new FactorialTrailingZeros();
        System.out.println(h.trailingZeroes(15));
    }
    public int trailingZeroes(int n) {
        int trailing = 0;
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
            if (product % 10 == 0){
                trailing++;
                System.out.println(product + " " + trailing);
                product /= 10;
            }
            System.out.println(product);
        }
        return trailing;
    }
}
