package java.imp;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public void sortColors(int[] nums) {
        int[] results = new int[3];
        Map<String, Integer> m = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            results[nums[i]]++;
        }

        int index = 0;
        for (int i=0;i<results.length;i++) {
            int count = results[i];
            while (count > 0) {
                nums[index] = i;
                count--;
                index++;
            }
        }
    }

}
