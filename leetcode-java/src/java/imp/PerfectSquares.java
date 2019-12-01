package java.imp;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
    public int numSquares(int n) {
        List<Integer> options = new ArrayList<>();

        for (int i=1;i<n+1;i++) {
            if (this.isPerfectSquare(i)) options.add(i);
        }
        System.out.println(options);
        // coin change problem
        int[] dp = new int[n+1];
        for (int i=1;i<dp.length;i++) {
            int minSquare = Integer.MAX_VALUE;
            for (int option: options) {
                if (i - option >= 0 && dp[i - option] + 1 < minSquare) {
                    minSquare = dp[i - option] + 1;
                }
            minSquare = minSquare < Integer.MAX_VALUE ? minSquare : 0;
                dp[i] = minSquare;
            }
        }

        return dp[n];
    }

    private boolean isPerfectSquare(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        System.out.println(perfectSquares.numSquares(12));
    }
}
