package Stack;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        MinimumAddToMakeParenthesesValid h = new MinimumAddToMakeParenthesesValid();
        System.out.println(h.minAddToMakeValid("((("));
    }
    public int minAddToMakeValid(String S) {
        Stack<Character> h = new Stack<>();
        for (char i : S.toCharArray()){
            if (h.size() > 0 && h.get(h.size() - 1) == '(' && i == ')'){
                System.out.println("pop");
                h.pop();
            }
            else {
                System.out.println("push");
                h.push(i);
            }
        }
        return h.size();
    }
}
