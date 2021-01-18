public class FindFirstSetBit {
    public static void main(String[] args) {
        FindFirstSetBit h = new FindFirstSetBit();
        System.out.println(getFirstSetBitPos(3));
    }
    public static int getFirstSetBitPos(int n){
        if (n == 0) return 0;
        if (n%2 == 1) return 1;
        return Integer.numberOfTrailingZeros((int) ((n & -n)+1) & n) + 1;
    }
}
