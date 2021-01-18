package Tree;

import java.util.Stack;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> h = new Stack<>();
        h.add(root);
        while (!h.isEmpty()){
            TreeNode g = h.pop();
            if (g != null){
                if (g.left != null && g.left.left == null && g.left.right == null)
                    sum += g.left.val;
                h.add(g.left);
                h.add(g.right);
            }
        }
        return sum;
    }
}
