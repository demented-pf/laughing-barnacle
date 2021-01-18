public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        ThreeConsecutiveOdds h = new ThreeConsecutiveOdds();
        h.threeConsecutiveOdds(new int[]{1,2,3,4,5,7,9});
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i]%2 == 1 && arr[i+1]%2 == 1 && arr[i+2]%2 == 1){
                return true;
            }
        }
        return false;
    }
}
