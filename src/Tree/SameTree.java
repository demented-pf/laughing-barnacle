package Tree;

import java.util.Stack;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> ps = new Stack<>();
        Stack<TreeNode> qs = new Stack<>();
        ps.push(p);
        qs.push(q);

        while (!ps.isEmpty()){
            TreeNode pPop = ps.pop();
            TreeNode qPop = qs.pop();

            if (pPop != null && qPop != null){
                if (pPop.val != qPop.val){
                    return false;
                }
                ps.push(pPop.left);
                ps.push(pPop.right);
                qs.push(qPop.left);
                qs.push(qPop.right);
            }
            else if (pPop != qPop){
                return false;
            }
        }
        return true;
    }
}
