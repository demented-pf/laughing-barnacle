import java.util.HashMap;

public class MaxOccuredDiggit {
    public static int maxOccured(int L[], int R[], int n, int maxx){
        int[] h = new int[maxx + 2];
        for (int i = 0; i < n; i++) {
            for (int j = L[i]; j < R[i] + 1; j++) {
                int g = h[j];
                h[j] = g + 1;
            }
        }
        int least = Integer.MAX_VALUE;
        for (int i = 0; i < h.length; i++) {
            if (h[i] < h[least]){
                least = i;
            }
        }
        return least;
    }
}
