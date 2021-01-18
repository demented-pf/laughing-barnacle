public class CheckIfStraightLine {
    public static void main(String[] args) {
        CheckIfStraightLine h = new CheckIfStraightLine();
        System.out.println((float)1/2);
        System.out.println(h.checkStraightLine(new int[][]{{1,-8},{2,-3},{1,2}}));
    }
    public boolean checkStraightLine(int[][] coordinates) {
        int x = Math.abs(coordinates[0][0] - coordinates[1][0]);
        int y = Math.abs(coordinates[0][1] - coordinates[1][1]);
        float g = 0;
        if (x == 0){
            g = 0;
        }
        else {
            g = (float) y / x;
        }
        System.out.println(g + " = g");
        for (int i = 1; i < coordinates.length - 1; i++) {

            if (coordinates[i][0] - coordinates[i+1][0] != 0) {
                if ((float) ((float) Math.abs(coordinates[i][1] - coordinates[i+1][1]) /
                        (float) Math.abs(coordinates[i][0] - coordinates[i + 1][0])) != g) {
                    return false;
                }
            }
            else if (g != 0){
                return false;
            }
        }
        return true;
    }
}
