package Sort;

import java.util.HashSet;
import java.util.Set;

public class TrustJudge {
    public int findJudge(int N, int[][] trust) {
        int[] h = new int[N];
        if (trust.length == 1){
            return trust[0][1];
        }
        if (trust.length == 0 && N == 1){
            return 1;
        }
        for (int i = 0; i < trust.length; i++) {
            System.out.println(trust[i][0]);
            System.out.println(trust[i][1] + "\n");
            h[trust[i][0] - 1] = 1;
            if (h[(trust[i][1]) - 1] == 2) {
                h[(trust[i][1]) - 1] = 3;
            }
            else if (h[(trust[i][1]) - 1] == 0){
                h[(trust[i][1]) - 1] = 2;
            }
        }

        for (int i = 0; i < h.length; i++) {
            if (h[i] > 2 ){
                return i + 1;
            }
        }
        return -1;
    }
}
