package Tree;

import java.util.Stack;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        Stack<TreeNode> h = new Stack<>();
        boolean containsTarget = true;

        while (containsTarget = true) {
            containsTarget = false;
            h.add(root);

            while (!h.isEmpty()) {
                TreeNode g = h.pop();
                if ((g.left == null && g.right == null) && g.val == target) {
                    containsTarget = true;
                    g = null;
                }
                else {
                    if (g.left != null) h.add(g.left);
                    if (g.right != null) h.add(g.right);
                }
            }
        }
        return root;
    }
}
