class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1) {
            return nums[0];
        }

        int n = nums.length;
        int[] dp = new int[n+1];
        dp[1] = nums[0];
        dp[2] = nums[1];

        for (int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3]) + nums[i-1];
        }

        return Math.max(dp[n], dp[n-1]);
    }
}
// nums[i] -> i번째 집이 가진 돈을 의미
// 인접한 두 집을 털수는 없다 -> i, i+2 이상
// 훔칠 수 있는 최대 돈을 구하라

// 여기서 dp[i]는 뭘 의미해야하나 -> 해당 자리까지 가는데 버는 최대 돈
// 그럼 그 자리까지 가는데 i-2 이상