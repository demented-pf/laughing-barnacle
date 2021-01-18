public class Majority {
    public int majorityWins(int arr[],int n,int x,int y)
    {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                a ++;
            }
            else if (arr[i] == y){
                b ++;
            }
        }
        if (a == b){
            return Math.min(x, y);
        }
        else if (a > b){
            return x;
        }
        else {
            return y;
        }
    }
}
