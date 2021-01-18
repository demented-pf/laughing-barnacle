import java.util.Arrays;

public class MedianMean {
    public int median(int A[],int N)
    {
        Arrays.sort(A);
        if (N % 2 == 0){
            return A[N/2 -1];
        }
        else {
            return A[N/2];
        }

    }

    public int mean(int A[],int N)
    {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return sum/N;
    }
}
