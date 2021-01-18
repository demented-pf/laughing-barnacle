package Tree;

import org.junit.jupiter.api.MethodOrderer;

import java.util.Random;
import java.util.Stack;

public class SumOfLeftOddBST {
    public int SumOfOddLeftMostChildren(TreeNode node) {
        int sum = 0;
        Stack<TreeNode> leftNodes = new Stack<>();
        leftNodes.push(node); // pushing the first node
        while (leftNodes.size() != 0){
            TreeNode lastElement = leftNodes.pop();
            if (lastElement != null){
                if (Math.abs(lastElement.val) % 2 == 1){
                    sum += Math.abs(lastElement.val);
                }
                leftNodes.push(lastElement.left);
            }
        }
        return sum;
    }

    private Random random = new Random();

//    public TreeNode binaryTreeGenerator(int n, int key, int left,int right){
//        if (n == 0)
//            return null;
//
//        TreeNode root = new TreeNode(key);
//
//        // Number of nodes in the left subtree (in [0, n-1])
//        int leftN = random.nextInt(n);
//        key += 1;
//        // Recursively build each subtree
//        root.left = new TreeNode(binaryTreeGenerator(leftN, key));
//        root.right = new TreeNode(binaryTreeGenerator(n - leftN - 1, key));
//        return root;
//    }

    public static void main(String[] args) {
//        SumOfLeftOddBST h = new SumOfLeftOddBST();

    }
}
