package Tree;

import java.util.Stack;

public class LCAOfBST {
    public static void main(String[] args) {
        TreeNode h = new TreeNode(3);
        h.left = new TreeNode(1);
        h.right = new TreeNode(4);
        h.left.right = new TreeNode(2);
        LCAOfBST m = new LCAOfBST();
        System.out.println(m.lowestCommonAncestor(h, new TreeNode(2), new TreeNode(4)).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);

        while (true){
            if (root.val < small){
                root = root.right;
            }
            else if (root.val > large){
                root = root.left;
            }
            else {
                return root;
            }
        }
    }
}
