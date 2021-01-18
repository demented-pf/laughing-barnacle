public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int mod = 0;
        while (numBottles >= numExchange) {
            mod = numBottles % numExchange;
            numBottles /= numExchange;
            result += numBottles;
            numBottles += mod;
        }
        return result;
    }
}
