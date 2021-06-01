package PracticeAlgorithm;

public class MaxDepthBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
      int depthLeft = 1 + maxDepth(root.left);
      int depthRight = 1 + maxDepth(root.right);
    return Math.max(depthLeft, depthRight);
  }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
