package Tree;

import java.util.Random;

public class RandomBinaryTree {
    private Random random = new Random();

    public TreeNode binaryTreeGenerator(int n, int key){
        if (n == 0)
            return null;

        TreeNode root = new TreeNode(key);

        // Number of nodes in the left subtree (in [0, n-1])
        int leftN = random.nextInt(n);
        key ++;
        // Recursively build each subtree
        root.left = new TreeNode(binaryTreeGenerator(leftN, key));
        root.right = new TreeNode(binaryTreeGenerator(n - leftN - 1, key));
        System.out.println(root.val);
        return root;
    }

    public static void main(String[] args) {
        RandomBinaryTree h = new RandomBinaryTree();
        h.binaryTreeGenerator(3, 1);
    }
}
