package Math;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        DivideTwoIntegers h = new DivideTwoIntegers();
        System.out.println(h.divide(7, -3));
    }
    public int divide(int dividend, int divisor) {
        int counter = 0;
        int n = 0;
        boolean neg = false;

        if (dividend < 0 || divisor < 0){
            neg = true;
            counter /= -1;
        }

        while (dividend > n){
            n += divisor;
            counter ++;
        }

        counter -= 1;
        if (neg){
            counter *= -1;
        }

        return counter;
    }
}
