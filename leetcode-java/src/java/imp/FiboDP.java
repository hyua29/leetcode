package java.imp;

public class FiboDP {
    public int solution(int A) {
        int[] dp = new int[A + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<dp.length;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[A];
    }

    public static void main(String[] args) {
        FiboDP sol = new FiboDP();

        int result = sol.solution(7);

        System.out.println(result);
    }
}
