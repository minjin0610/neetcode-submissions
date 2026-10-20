class Solution {
    public int countSubstrings(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {

                int j = i + length - 1;

                if (length == 2 || length == 3) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                    if (dp[i][j]) {
                        count++;
                    }
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
                    if (dp[i][j]) {
                        count++;
                    }
                }
            }
        }
        
        return count + s.length();
    }
}

// 문자열 s의 palindrome인 substring의 개수를 반환
// 단, 문자열이 같으면 서로 다른 substring은 다른 palindrome으로 간주함
// e.g. aaa -> aa != aa


// class Solution {
//     public int countSubstrings(String s) {
//         int n = s.length();
//         boolean[][] dp = new boolean[n][n];
//         int count = n;

//         for (int len = 2; len <= n; len++) {
//             for (int i = 0; i <= n - len; i++) {
//                 int j = i + len - 1;

//                 if (s.charAt(i) == s.charAt(j)) {
//                     if (len <= 3 || dp[i + 1][j - 1]) {
//                         dp[i][j] = true;
//                         count++;
//                     }
//                 }
//             }
//         }

//         return count;
//     }
// }
