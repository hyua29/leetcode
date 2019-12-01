package java.imp;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        this.aux(solution, new ArrayList<Integer>(), nums);
        return solution;
    }

    private void aux(List<List<Integer>> solution, ArrayList<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            solution.add(new ArrayList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++) {
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            this.aux(solution, list, nums);
            list.remove(list.indexOf(nums[i]));
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        Permutations permutations = new Permutations();
        System.out.println(permutations.solution(array));
    }

}
