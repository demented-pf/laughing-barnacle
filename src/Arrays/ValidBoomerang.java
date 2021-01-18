package Arrays;

import java.util.Arrays;

public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        Arrays.sort(points);
        if (points[1][0]/points[0][0] == points[2][0]/points[1][0]){
            return false;
        }
        if (points[1][1]/points[0][1] == points[2][1]/points[1][1]){
            return false;
        }
        return true;
    }
}
