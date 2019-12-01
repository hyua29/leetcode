package java.imp;


public class CoinDP {

    public int solution(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i=1;i<dp.length;i++) {
            int minCoin = Integer.MAX_VALUE;
            for (int coinValue: coins) {
                if (i - coinValue >= 0 && dp[i - coinValue] != -1) {
                    minCoin = dp[i - coinValue] + 1 < minCoin ? dp[i - coinValue] + 1 : minCoin;
                }
            }
            dp[i] = minCoin < Integer.MAX_VALUE ? minCoin : -1;
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        CoinDP coinDP = new CoinDP();

        int[] A = new int[] {2};
        int result = coinDP.solution(A, 3);
        System.out.println(result);
    }
}
