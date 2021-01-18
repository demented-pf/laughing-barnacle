public class KthBitSet {
    public static void main(String[] args) {
        KthBitSet h = new KthBitSet();
        System.out.println(h.checkKthBit(76, 4));
    }
    static boolean checkKthBit(int n, int k){
        if ((n & (1 << k)) != 0) {
            return true;
        }

        else{
            return false;
        }

    }
}
