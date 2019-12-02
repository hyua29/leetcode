package java.imp;

import java.imp.utils.TreeNode;

public class LongestCommonAncestorBTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode commonNode = null;
        boolean[] indicator = new boolean[3];
        return this.aux(root, p, q, indicator, commonNode);
    }

    private TreeNode aux(TreeNode node, TreeNode p, TreeNode q, boolean[] indicator, TreeNode commonNode) {
        if (node == null) return null;

        if (node.val == p.val) indicator[0] = true;

        if (node.val == q.val) indicator[1] = true;

        TreeNode left = this.aux(node.left, p, q, indicator, commonNode);
        TreeNode right = this.aux(node.right, p, q, indicator, commonNode);

        if (indicator[0] && indicator[1] && !indicator[2]) {
            indicator[2] = true;
            return node;
        }

        if (left != null) return left;
        if (right != null) return right;

        return null;

    }

}
