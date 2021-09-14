package tree;

import java.util.ArrayList;
import java.util.List;

public class IncreaseOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root,vals);
        return root;

    }

    public void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) return;
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}
