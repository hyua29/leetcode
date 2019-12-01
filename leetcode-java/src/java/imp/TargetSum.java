package java.imp;


public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        int positiveSum = (S + sum) / 2;
        if (positiveSum < S) return 0;

        int[] ref = new int[1];

        this.backtrack(nums, ref, 0, positiveSum, 0);
        return ref[0];
    }

    private void backtrack(int[] nums, int[] ref, int index, int targetSum, int currentSum) {
        if (currentSum == targetSum) {
            ref[0] += 1;
            for (int i=index;i<nums.length;i++) {
                if (nums[i] == 0) ref[0] += 1;
            }
            return;
        }

        for (int i=index;i<nums.length;i++) {
            if (currentSum + nums[i] > targetSum) continue;
            this.backtrack(nums, ref, i + 1, targetSum, currentSum + nums[i]);
        }

    }


    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();

        System.out.println(targetSum.findTargetSumWays(new int[] {1,0}, 1));
    }
}
