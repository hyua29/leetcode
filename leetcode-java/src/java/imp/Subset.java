package java.imp;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        this.aux(result, new ArrayList<Integer>(), 0, nums);
        return result;

    }

    private void aux( List<List<Integer>> result, List<Integer> list, int index, int[] nums) {
        result.add(new ArrayList<>(list));
        for (int i=index;i<nums.length;i++) {
            list.add(nums[i]);
            this.aux(result, list, i + 1, nums);
            list.remove(list.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        Subset subset = new Subset();
        List<List<Integer>> result = subset.subsets(a);
        System.out.println(result);
    }
}
