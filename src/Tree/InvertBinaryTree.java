package Tree;

import java.util.Stack;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();
        TreeNode h = new TreeNode(root.val);
        left.add(root.left);
        right.add(root.right);
        while (!left.isEmpty() && !right.isEmpty()){
            TreeNode l = left.pop();
            TreeNode r = right.pop();
            if (l != null && r != null) {
                h.left = r;
                h.right = l;
                left.add(l.left);
                left.add(l.right);
                right.add(r.right);
                right.add(r.left);
            }
//            else if (l == null && r != null){
//                h.left = r;
//            }
//            else if (l != null && r == null){
//                h.right = l;
//            }
        }

        return h;
    }
}
