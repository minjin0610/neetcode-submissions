class Solution {
    public int tribonacci(int n) {
        
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i=3; i<=n; i++) {
            int next = a+b+c;
            a = b;
            b = c;
            c = next;
        }

        return c;
    }
}



// class Solution {
//     public int tribonacci(int n) {
        
//         switch (n) {
//             case 0:
//                 return 0;
//             case 1:
//                 return 1;
//             case 2:
//                 return 1;
//         }

//         int[] dp = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         dp[2] = 1;

//         for (int i=3; i<=n; i++) {
//             dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
//         }

//         return dp[n];
//     }
// }

// 피보나치 sequence Tn -> T0 = 0, T1 = 1, T2 = 1, Tn+3 = Tn + Tn+1 + Tn+2 
// n을 통해 Tn의 값을 구하여라
// Tn = Tn+3 - Tn+1 - Tn+2