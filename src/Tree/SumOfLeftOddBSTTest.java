package Tree;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SumOfLeftOddBSTTest {

    @Test
    void left_with_one_odd() {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(3);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),4);
    }

    @Test
    void empty() {
        TreeNode t = new TreeNode(2);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),0);
    }
    @Test
    void left_with_just_even() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(4);
        t.right = new TreeNode(3);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),0);
    }
    @Test
    void left_with_nothing_right_filled() {
        TreeNode t = new TreeNode(2);
        t.right = new TreeNode(0);
        t.right = new TreeNode(1);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),0);
    }
    @Test
    void negative_left_right() {
        TreeNode t = new TreeNode(-2);
        t.left = new TreeNode(-1);
        t.right = new TreeNode(-3);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),1);
    }
    @Test
    void left_filled_right_empty() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(1);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),1);
    }
    @Test
    void depth_of_two_left_nodes() {
        Random r = new Random();
        int rand = r.nextInt(100);
        TreeNode t = new TreeNode(rand);
        t.left = new TreeNode(rand + 2);
        t.left.left = new TreeNode(rand + 3);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        if (rand%2 == 1){
            assertEquals( s.SumOfOddLeftMostChildren(t),rand + (rand +2));
        }
        else {
            assertEquals( s.SumOfOddLeftMostChildren(t),rand + 3);
        }
    }
    @Test
    void only_even() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(4);
        t.right = new TreeNode(8);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),0);
    }
    @Test
    void only_odd() {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(7);
        t.right = new TreeNode(9);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals( s.SumOfOddLeftMostChildren(t),10);
    }
    @Test
    void positive_plus_negative() {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(-3);
        t.right = new TreeNode(5);
        SumOfLeftOddBST s = new SumOfLeftOddBST();
        assertEquals(s.SumOfOddLeftMostChildren(t),6);
    }
}