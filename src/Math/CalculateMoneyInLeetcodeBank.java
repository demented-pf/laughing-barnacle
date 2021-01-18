package Math;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank h = new CalculateMoneyInLeetcodeBank();
        System.out.println(h.totalMoney(10));
    }

    public int totalMoney(int n) {
        int mondays = n / 7;
        int res = 0;

        for (int i = 1; i <= mondays; i++) {
            int h = 7 * (i + 3);
            res += h;
        }

        for (int i = 7 * mondays; i < n; i++) {
            res += mondays + 1;
            mondays ++;
        }
        return res;
    }
}
