package Tree;

import java.util.Stack;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        Stack<TreeNode> h = new Stack<>();
        h.add(root);

        while (!h.isEmpty()){
            TreeNode n = h.peek();
            if (n != null){
                boolean hasOne = false;
                if (n.val == 0){
                    Stack<TreeNode> l = new Stack<>();
                    l.add(n);

                    while (!l.isEmpty()){
                        TreeNode y = l.pop();
                        if (y != null){
                            if (y.val == 1){
                                hasOne = true;
                                break;
                            }
                            if (y.left != null) l.add(y.left);
                            if (y.right != null) l.add(y.right);
                        }
                    }
                }
                n = h.pop();
                if (!hasOne){
                    System.out.println("taco");
                    n = null;

                }

                if (n != null) {
                    if (n.right != null) {
                        h.add(n.right);
                    }
                    if (n.left != null) {
                        n.left = new TreeNode(3);
                        h.add(n.right);
                    }
                }
            }
        }
        return root;
    }
}
