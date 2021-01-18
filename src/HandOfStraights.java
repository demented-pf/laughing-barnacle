import java.util.Arrays;

public class HandOfStraights {
    public static void main(String[] args) {
        HandOfStraights h = new HandOfStraights();
        System.out.println(h.isNStraightHand(new int[]{1, 2, 3, 5, 4, 6, 7, 8}, 2));
    }
    public boolean isNStraightHand(int[] hand, int W) {

        if (hand.length == W){
            return IfHandLengthEqualsW(hand);
        }
        if (hand.length % W == 0){
            Arrays.sort(hand);
            boolean[] whetherUsed = new boolean[hand.length];
            Arrays.fill(whetherUsed, false);
            int[][] endJaggedArray = new int[whetherUsed.length / W][W];
            for (int i = 0; i < hand.length / W; i++) {
                int counter = 0;
                for (int j = 0; j < hand.length; j++) {
                    if (counter == 0){
                        if (!whetherUsed[j]){
                            endJaggedArray[i][counter] = hand[j];
                            whetherUsed[j] = true;
                            counter ++;
                        }
                    }
                    else {
                        if (counter >= W){
                            break;
                        }
                        if (!whetherUsed[j]){
                            if (hand[j] == endJaggedArray[i][counter - 1] + 1){
                                endJaggedArray[i][counter] = hand[j];
                                whetherUsed[j] = true;
                                counter ++;
                            }
                        }
                    }
                }
            }
            if (checking(endJaggedArray)) return false;
            return true;
        }
        else{
            return false;
        }
    }

    private boolean checking(int[][] g) {
        for (int k = 0; k < g.length; k++) {
            for (int l = 0; l < g[k].length; l++) {
                if (g[k][l] == 0){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean IfHandLengthEqualsW(int[] hand) {
        Arrays.sort(hand);
        System.out.println(Arrays.toString(hand));
        int oldNumber = hand[0];
        boolean g = true;
        for (int i = 1; i < hand.length; i++) {
            if (oldNumber != hand[i] - 1){
                g = false;
                break;
            }
            oldNumber = hand[i];

        }
        return g;
    }
}
