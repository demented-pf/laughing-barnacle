public class StrongestNeighbor {
    public static void main(String[] args) {
        StrongestNeighbor h = new StrongestNeighbor();
        h.maximumAdjacent(3, new int[]{78, 77, 45});
    }
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+1]){
                System.out.println(arr[i]);
            }
            else {
                System.out.println(arr[i+1]);
            }
        }
    }
}
