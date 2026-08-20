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

// cost 배열, cost[i]는 i번쨰 계단까지 올라가는데 드는 비용
// 비용을 지붎하면 (i + 1)th floor or the (i + 2)th floor로 갈 수 있음
// 시작을 인덱스 0 또는 1에서 할 수 있음
// 최소 비용을 골라라