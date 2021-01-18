import java.util.ArrayList;
import java.util.List;

public class MinStack {
    List<Integer> h;
    public MinStack() {
        h = new ArrayList<>();
    }

    public void push(int x) {
        h.add(x);
    }

    public void pop() {
        h.remove(h.size() - 1);
    }

    public int top() {
        return h.get(h.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int g : h){
            if (g < min){
                min = g;
            }
        }
        return min;
    }
}
