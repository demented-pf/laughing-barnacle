package Recurtion;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n < 2) return n;
        int first = 0;
        int second = 1;
        int third = 1;
        int replace;
        while (n - 1 > 2) {
            replace = first + second + third;
            first = second;
            second = third;
            third = replace;
        }
        return third;
    }
}
