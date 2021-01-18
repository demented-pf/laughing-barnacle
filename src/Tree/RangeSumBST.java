package Tree;

import Tree.TreeNode;

import java.util.Stack;





public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> h = new Stack();
        int sum = 0;
        h.push(root);
        while (h.size() != 0){
            TreeNode g = h.pop();
            if (g != null) {
                if (g.val <= high && g.val >= low) {
                    sum += g.val;
                }
                if (g.val > low) {
                    h.push(g.left);
                }
                if (g.val < high) {
                    h.push(g.right);
                }
            }
        }
        return sum;
    }
}
