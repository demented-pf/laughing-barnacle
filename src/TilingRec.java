public class TilingRec {
    public int tilingRectangle(int n, int m) {
        int size = n * m;
        int numTiles = 0;
        while (size > 0){
            if (n != m) {
                size -= Math.min(n, m) * Math.min(m, n);
                numTiles ++;
                if (Math.min(n, m) == m){
                    n -= m;
                }
                if (Math.min(n, m) == n){
                    m -= n;
                }
            }
            else {
                size -= n*n;
                numTiles ++;
                return numTiles;
            }
        }
        return numTiles;
    }
}
