package java.imp;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length - 1;i++) {
            int swapCount = 0;
            for (int j=i;j<nums.length - 1;j++) {
                if (nums[j] == 0) {
                    this.swap(nums, j, j + 1);
                    swapCount++;
                }
            }
            if (swapCount == 0) break;
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
