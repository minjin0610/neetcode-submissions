class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n+1];
        dp[1] = cost[0];
        dp[2] = Math.min(cost[0]+cost[1], cost[1]);
        System.out.println(dp[1] + " " + dp[2]);

        for (int i=3; i<=n; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i-1];
            System.out.println(dp[i]);
        }

        return Math.min(dp[n], dp[n-1]);
    }
}
