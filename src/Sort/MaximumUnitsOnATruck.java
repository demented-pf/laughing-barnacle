package Sort;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (boxTypes[i][0] <= truckSize){
                units += (boxTypes[i][0] * boxTypes[i][1]);
                System.out.println(boxTypes[i][0] * boxTypes[i][1]);
                truckSize -= boxTypes[i][0];
            }
            else {
                units += boxTypes[i][1] * truckSize;
                return units;
            }
        }
        return units;
    }
}
