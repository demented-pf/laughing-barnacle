package BitManuplation;

public class NumberComplement {
    public static void main(String[] args) {
        NumberComplement h = new NumberComplement();
        System.out.println(h.findComplement(2));
    }
    public int findComplement(int num) {
        if (num == 1){
            return 0;
        }

        int n = 0;
        int h = num;

        while (num > 0){
            if ((num & 1) == 0){
                n += 1;
            }
            else {
                n *= 2;
            }
            num >>= 1;
        }

        for (int i = 0; i < (int) (Math.sqrt(h) + 1); i++) {
            if (Math.pow(2, i) == h){
                return n - 1;
            }
        }
        return n;
    }
}
