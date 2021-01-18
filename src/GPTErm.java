public class GPTErm {
    public double termOfGP(int A,int B,int N)
    {
        double r = B/A;
        return A* Math.pow(r, N-1);
    }
}
