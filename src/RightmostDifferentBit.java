public class RightmostDifferentBit {
    public static void main(String[] args) {
        RightmostDifferentBit h = new RightmostDifferentBit();
        System.out.println(h.posOfRightMostDiffBit(52, 4));
    }
    public int posOfRightMostDiffBit(int m, int n) {
        return Integer.numberOfTrailingZeros(m ^ n) + 1;
    }
}
