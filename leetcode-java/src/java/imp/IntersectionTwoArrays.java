package java.imp;

import java.util.*;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (int num: nums1) {
            set.add(num);
        }

        Set<Integer> matches = new HashSet<>();
        for (int num: nums2) {
            if (set.contains(num)) matches.add(num);
        }

        int[] result = new int[matches.size()];
        int i = 0;
        for (int match: matches) {
            result[i] = match;
            i++;
        }

        return result;
    }
}
