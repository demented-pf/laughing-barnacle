public class FactorialOfNumber {
    public static void main(String[] args) {
        FactorialOfNumber h = new FactorialOfNumber();
        System.out.println(h.digitsInFactorial(42));
    }
    public long digitsInFactorial(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
        int counter = 0;
        while (result > 0){
            counter ++;
            result /= 10;
        }
        return counter;

    }
}
