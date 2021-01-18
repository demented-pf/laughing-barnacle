import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        QuadraticEquationRoots h =  new QuadraticEquationRoots();
        System.out.println(h.quadraticRoots(752, 904, 164));
    }
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> h = new ArrayList<>();
        if ((b*b) - 4*a*c < 0){
            h.add(-1);
            return h;
        }
        long B = b*b;
        long d = 4*a*c;
        long x = 2*a;
        double theSquareRoot = Math.sqrt(B - d);


        return h;
    }
}
