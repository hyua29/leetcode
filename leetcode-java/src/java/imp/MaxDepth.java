package java.imp;

import java.imp.utils.TreeNode;

public class MaxDepth {
    public int solution(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return this.aux(node, 1);
    }

    public int aux(TreeNode node, int height) {
        if (node == null) {
            return height;
        }
        int leftHeight = height;
        int rightHeight = height;
        if (node.left != null) {
            leftHeight  = this.aux(node.left, height + 1);
        }
        if (node.right != null) {
            rightHeight = this.aux(node.right, height + 1);
        }

        return leftHeight > rightHeight ? leftHeight : rightHeight;

    }

    public static void main(String[] args) {
        MaxDepth maxDepth = new MaxDepth();
        TreeNode root = new TreeNode(7);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(8);
        root.left = left;
        root.right = right;

        int result = maxDepth.solution(root);

        System.out.println(result);
    }
}
