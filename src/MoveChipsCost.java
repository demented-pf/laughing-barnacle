import java.util.HashMap;

public class MoveChipsCost {
    public int minCostToMoveChips(int[] position) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int number = -1;
        int counter = -1;
        for (int i = 0; i < position.length; i++) {
            if (h.containsKey(position[i])){
                int newValue = h.get(position[i]) + 1;
                h.replace(position[i], newValue);
                if (newValue >= counter) {
                    counter = newValue;
                    number = position[i];
                }
            }
            else {
                h.put(position[i], 1);
                if (1 >= counter) {
                    counter = 1;
                    number = position[i];
                }
            }
        }

        int cost = 0;
        return cost;
    }
}
