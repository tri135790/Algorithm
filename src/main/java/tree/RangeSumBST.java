package tree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class RangeSumBST {

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int count = 0;
        if (root != null) {
            if (low <= root.val && root.val <= high) {
                count += root.val;
            }
            count += rangeSumBST(root.left,low,high);
            count += rangeSumBST(root.right,low,high);
        }
        return count;
    }

    public static int rangeSumBST2(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val < low) return rangeSumBST2(root.right, low, high);
        if (root.val > high) return rangeSumBST2(root.left, low, high);
        return root.val + rangeSumBST2(root.left,low,high) + rangeSumBST2(root.right,low,high);
    }



    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        System.out.println(rangeSumBST(treeNode,7,15));
    }
}
