package Tree;

import java.util.*;

public class minimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> h = new Stack<>();
        List<Integer> m = new ArrayList<>();
        h.add(root);
        while (!h.isEmpty()){
            TreeNode l = h.pop();
            if (l != null) {
                m.add(l.val);
                h.add(l.left);
                h.add(l.right);
            }
        }
        Collections.sort(m);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m.size() - 1; i++) {
            int difference = m.get(i + 1) - m.get(i);
            if (difference < min){
                min = difference;
            }
        }
        return min;
    }
}
