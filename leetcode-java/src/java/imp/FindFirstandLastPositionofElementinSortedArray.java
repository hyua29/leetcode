package java.imp;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int matchIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                matchIndex = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (matchIndex == -1) return new int[] {1, 1};

        int lowIndex = matchIndex;
        int highIndex = matchIndex;
        while(lowIndex >= 0 && nums[lowIndex] == target) lowIndex--;
        while(highIndex < nums.length && nums[highIndex] == target) highIndex++;

        return new int[] {lowIndex + 1, highIndex - 1};
    }
}
