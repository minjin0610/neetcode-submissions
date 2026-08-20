class Solution {
    public int climbStairs(int n) {
        
        if (n==1) {
            return 1;
        }

        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}

// 정수 n -> 정상으로 가기 위해 남은 걸음 수
// 한번에 1 또는 2 올라감
// 계단 정상으로 올라가는 경우의 수 구하라

