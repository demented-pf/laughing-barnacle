package Tree;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        int left = deepestLeavesSum(root.left);
        int right = deepestLeavesSum(root.right);
        return Math.max(left, right) + 1;
    }
}
