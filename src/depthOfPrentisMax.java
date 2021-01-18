import java.util.Stack;

public class depthOfPrentisMax {
    public int maxDepth(String s) {
        Stack<String> h = new Stack<>();
        int maxNumParentheses = 0;
        for (char i : s.toCharArray()){
            if (i == '('){
                h.push("(");
                maxNumParentheses = Math.max(maxNumParentheses, h.size());
            }
            else if (i == ')'){
                h.pop();
            }
        }
        return maxNumParentheses;
    }
}
