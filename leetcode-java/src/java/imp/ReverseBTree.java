package java.imp;

import utils.TreeNode;

public class ReverseBTree {
    public TreeNode invertTree(TreeNode root) {
        this.aus(root);
        return root;
    }

    private void aus(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        this.aus(node.left);
        this.aus(node.right);
    }
}
