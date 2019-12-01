package java.imp;

public class MissingInteger {
    public int solution(int[] A) {

        boolean[] dp = new boolean[2000001];

        for (int i=0;i<A.length;i++) {
            dp[A[i] + 1000000] = true;
        }

        int index = 0;
        for (int j=1000001;j<dp.length;j++) {
            if (!dp[j]) {
                index = j;
                break;
            }
        }

        return index - 1000000;
    }

    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = new int[] {1, 3, 6, 4, 1, 2};
        int result = missingInteger.solution(A);
        System.out.println(result);
    }
}
