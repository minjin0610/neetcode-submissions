class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int n = nums.length;
        int[] dp1 = new int[n+1]; 
        int[] dp2 = new int[n+1]; 

        dp1[1] = nums[0];
        dp1[2] = Math.max(nums[0], nums[1]);
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);

        for(int i=3; i<n; i++) {
            dp1[i] = Math.max(dp1[i-1], dp1[i-2]+nums[i-1]); 
            dp2[i] = Math.max(dp2[i-1], dp2[i-2]+nums[i]); 
        }

        return Math.max(dp1[n-1], dp2[n-1]);
    }
}

// nums[i]는 i 번째 집이 가진 돈을 의미
// 집들은 원으로 이어져잇다
// 인접한 두 집은 털지 못한다

// 