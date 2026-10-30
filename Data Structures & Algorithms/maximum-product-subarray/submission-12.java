class Solution {
    public int maxProduct(int[] nums) {

        int maxDp = nums[0];
        int minDp = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int startNew = current;
            int extendMax = maxDp * current;
            int extendMin = minDp * current;

            maxDp = Math.max(startNew,
                     Math.max(extendMax, extendMin));

            minDp = Math.min(startNew,
                     Math.min(extendMax, extendMin));

            ans = Math.max(ans, maxDp);
        }

        return ans;
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
        
//         int n = nums.length;
//         int[][] dp = new int[n][n];
//         int ans = Integer.MIN_VALUE;
        
//         for (int length = 0; length < n; length++) {
//             for (int i = 0; i < n-length; i++) {
//                 int j = i + length;

//                 if (length == 0) {
//                     ans = Math.max(ans, nums[i]);
//                 }
//                 else if (length == 1) {
//                     dp[i][j] = nums[i] * nums[j];
//                     ans = Math.max(ans, dp[i][j]);
//                 } else {
//                     dp[i][j] = dp[i][j-1] * nums[j];
//                     ans = Math.max(ans, dp[i][j]);
//                 }
//             }
//         }
        
//         return ans;
//     }
// }

// nums 주어짐, 가장 큰 곱셈 결과를 가진 부분 집합을 return
// 단, 요소가 연속되어야함