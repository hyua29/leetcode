package java.imp;

import java.util.Arrays;

public class UnboundedKnapsackDP {
    public int solution(int[] weight, int[] value, int targetWeight) {
        int[] dp = new int[targetWeight +1];
        for (int i=1;i<dp.length;i++) {
            int minPrice = Integer.MAX_VALUE;
            int minPriceIndex = -1;
            for(int j=0;j<weight.length;j++) {
                if (i-weight[j] >= 0 && (dp[i-weight[j]] + value[j]) < minPrice) {
                    minPrice = dp[i-weight[j]] + value[j];
                    minPriceIndex = j;
                }

            }
            if (minPriceIndex == -1) {
                dp[i] = -1;
            } else {
                dp[i] = dp[i - weight[minPriceIndex]] + value[minPriceIndex];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        UnboundedKnapsackDP unboundedKnapsackDP = new UnboundedKnapsackDP();

        int[] weight = new int[] {9, 5, 6, 1};
        int[] value = new int[] {550, 350, 180, 40};
        int result = unboundedKnapsackDP.solution(weight, value, 12);
        System.out.println(result);
    }

}
