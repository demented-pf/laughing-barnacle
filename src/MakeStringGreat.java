import java.util.Stack;

public class MakeStringGreat {
    public String makeGood(String s) {
        String result = "";

        Stack<Character> h = new Stack<>();
        boolean g = false;
        for (int i = 0; i < s.length(); i++) {
            if (h.size() > 0){
                if (((int) s.charAt(i) -32 == (int) h.peek()) ||
                        ((int) s.charAt(i) + 32 == (int) h.peek())){
                    h.pop();
                }
                else{
                    System.out.println("x");
                    g = true;
                }
            }
            System.out.println(h.size());
            if (h.size() == 0 || g == true){
                System.out.println("i");
                h.add(s.charAt(i));
                g = false;
            }
        }
        System.out.println(h.toString());
        for (int i = 0; i < h.size(); i++) {
            result += h.get(i);
        }
        return result;
    }
}
