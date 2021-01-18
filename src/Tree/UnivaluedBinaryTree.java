package Tree;

import java.util.Stack;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        Stack<TreeNode> h = new Stack<>();
        int num = root.val;
        h.push(root);
        while (h.size() != 0){
            TreeNode g = h.pop();
            if (g != null) {
                if (g.val != num) {
                    return false;
                }
                h.push(g.right);
                h.push(g.left);
            }
        }
        return true;
    }
}
