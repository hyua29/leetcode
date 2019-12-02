package java.imp;

import java.imp.utils.TreeNode;

public class SortedArrayToBTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int mid = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        this.aux(nums, 0, mid - 1, root);
        this.aux(nums, mid+1, nums.length - 1, root);
        return root;
    }

    public void aux(int[] nums, int left, int right, TreeNode parent) {
        if (left > right) {
            return;
        }
        int mid = (left + right) / 2;
        int value = nums[mid];

        TreeNode node = new TreeNode(value);
        if (value < parent.val) {
            parent.left = node;
        } else {
            parent.right = node;
        }

        this.aux(nums, left, mid - 1, node);
        this.aux(nums, mid + 1, right, node);
    }
}
