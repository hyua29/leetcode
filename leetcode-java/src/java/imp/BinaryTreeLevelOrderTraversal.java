package java.imp;

import java.imp.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<ArrayList<Integer>> solution(TreeNode root) {
        List<ArrayList<Integer>> temp = new ArrayList<>();

        if (root == null) {
            return temp;
        }

        aux(root, temp, 1);

        return temp;
    }

    public void aux(TreeNode node, List<ArrayList<Integer>> list, int height) {
        if (height > list.size()) {
            list.add(new ArrayList<Integer>());
        }
        ArrayList<Integer> listAtCurrentHeight = list.get(height - 1);
        listAtCurrentHeight.add(node.val);
        if (node.left != null) {
            this.aux(node.left, list, height + 1);
        }
        if (node.right != null) {
            this.aux(node.right, list, height + 1);
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(7);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(8);
        root.left = left;
        root.right = right;

        List<ArrayList<Integer>> list = binaryTreeLevelOrderTraversal.solution(root);

        System.out.println(list);
    }
}
