package java.imp;

import java.imp.utils.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        boolean[] indicator = {true};

        this.aux(root, indicator);

        return indicator[0];
    }

    private int aux(TreeNode node, boolean[] indicator) {

        if (node == null) return 0;

        int leftHeight = 1 + this.aux(node.left, indicator);
        int rightHeight = 1 + this.aux(node.right, indicator);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            indicator[0] = false;
        }

        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }
}
