package Tree;

import java.util.Stack;

public class FindClone {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Stack<TreeNode> h = new Stack<>();
        h.add(cloned);
        while (!h.isEmpty()){
            TreeNode g = h.pop();
            if (g != null) {
                if (g.val == target.val) {
                    return g;
                }
                h.add(g.left);
                h.add(g.right);
            }
        }
        return new TreeNode(1);
    }
}
