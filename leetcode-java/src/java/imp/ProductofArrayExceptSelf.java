package java.imp;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] results = new int[nums.length];
        results[0] = 1;

        int accumulator = nums[0];
        for (int i=1;i<nums.length;i++) {
            results[i] = accumulator;
            accumulator *= nums[i];
        }

        accumulator = nums[nums.length - 1];
        for (int i=nums.length - 2;i>=0;i--) {
            results[i] = accumulator * results[i];
            accumulator *= nums[i];
        }

        return results;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();

        productofArrayExceptSelf.productExceptSelf(new int[] {4,3,2,1,2});
    }
}
