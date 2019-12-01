package java.imp;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        return this.search(nums, low, high, target);
    }

    private int search(int[] nums, int low, int high, int target) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (nums[mid] == target) return mid;

        if (nums[low] <= nums[mid]) {
            if (nums[low] <= target && target < nums[mid]) {
                return this.search(nums, low, mid - 1, target);
            }
            return this.search(nums, mid + 1, high, target);
        }

        if (nums[mid] < target && target <= nums[high]) {
            return this.search(nums, mid + 1, high, target);
        }

        return this.search(nums, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 1};
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        System.out.println(searchinRotatedSortedArray.search(nums, 1));
    }
}
