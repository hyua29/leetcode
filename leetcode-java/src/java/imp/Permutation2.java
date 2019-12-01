package java.imp;

import java.util.*;

public class Permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        this.permute(nums, new boolean[nums.length], new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void permute(int[] nums, boolean[] used, List<Integer> current, Set<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i=0;i<nums.length;i++) {
            if (used[i]) continue;
            current.add(nums[i]);
            used[i] = true;
            this.permute(nums, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutation2 permutation2 = new Permutation2();

        int[] nums = new int[] {1,1,2};

        System.out.println(permutation2.permuteUnique(nums));
    }
}
