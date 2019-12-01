package java.imp;

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(candidates);
        this.aux(solution, new ArrayList<>(), candidates, target);
        return new ArrayList<>(solution);
    }

    private void aux(List<List<Integer>> solution, List<Integer> list, int[] candidates, int target) {
        int currentSum = 0;
        for (int value: list) {
            currentSum += value;
        }
        if (currentSum == target) {
            solution.add(new ArrayList<>(list));
            return;
        }

        if (currentSum > target) return;

        for (int i=0;i<candidates.length;i++) {
            list.add(candidates[i]);
            this.aux(solution, list, candidates, target);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
    }
}
