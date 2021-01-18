package Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum h = new MatrixDiagonalSum();
        System.out.println(h.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
//    public int diagonalSum(int[][] mat) {
//        int sum = 0;
//        boolean odd = false;
//        int row = 0;
//
//        if (mat.length % 2 == 1){
//            odd = true;
//        }
//
//        for (int col = 0; col < mat.length; col++) {
//            sum += mat[row][col];
//            row++;
//        }
//
//        row = 0;
//        for (int col = mat.length - 1; col >= 0; col--) {
//            if (odd && col != ((mat.length/2))){
//                sum += mat[row][col];
//                System.out.println(mat[row][col]);
//            }
//            else if (!odd){
//                sum += mat[row][col];
//            }
//            row++;
//        }
//        return sum;
//    }


    public int diagonalSum(int[][] mat) {
        int sum = 0;
        boolean odd = false;
        int row = 0;

        if (mat.length % 2 == 1){
            odd = true;
        }

        for (int col = 0; col < mat.length; col++) {
            sum += mat[row][col];
            row++;
        }

        row = 0;
        for (int col = mat.length - 1; col >= 0; col--) {
            sum += mat[row][col];
            row++;
        }

        if (odd){
            sum -= mat[mat.length/2][mat.length/2];
        }

        return sum;
    }
}
