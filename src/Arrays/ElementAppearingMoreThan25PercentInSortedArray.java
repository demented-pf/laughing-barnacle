package Arrays;

public class ElementAppearingMoreThan25PercentInSortedArray {
    public int findSpecialInteger(int[] arr) {
        int counter = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num){
                if (counter > arr.length/4) return num;
                num = arr[i];
                counter = 1;
            }
            else counter ++;
        }
        return num;
    }
}
