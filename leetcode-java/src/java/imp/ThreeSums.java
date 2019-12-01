package java.imp;

import java.util.*;

public class ThreeSums {
    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0 && nums[i-1] == nums[i]) continue;  // skip some of the combinations and include 0 0 0
            int low = 0;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));  // no duplicate if a set is use
                    high--;
                    low++;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        ThreeSums threeSums = new ThreeSums();

//        int[] A = new int[] {-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> list = threeSums.solution(A);
//
//        System.out.println(list);

        int[][] s = new int[3][4];
        for (int i=0;i<s.length;i++) {
            for (int j=0;j<s.length;j++) {
                System.out.println(i);
                System.out.println(j);
            }
        }


    }
}
