public class TheHammeringDistance {
    public static void main(String[] args) {
        TheHammeringDistance h = new TheHammeringDistance();
        System.out.println(h.hammingDistance(93, 73));
    }
    public int hammingDistance(int x, int y) {
        int result = 0;
        while (Math.max(x, y) > 0){
            if (x % 2 != y % 2){
                result += 1;
            }
            x >>= 1;
            y >>= 1;
        }
        return result;
    }
}
