package java.imp;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                int value = height[right] * (right - left);
                if (value > max) max = value;
                right--;
            } else {
                int value = height[left] * (right - left);
                if (value > max) max = value;
                left++;
            }
        }
        return max;
    }
}
