public class Insert {
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element) {
        int n = 0;
        int g = 0;
        n = arr[index];
        arr[index] = element;
        for (int i = index+1; i < sizeOfArray; i++) {
            g = arr[i];
            arr[i] = n;
            n = g;
        }
    }
}
