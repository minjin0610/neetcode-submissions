class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int maxLength = 1;
        int start = 0;

        // len = 현재 검사할 부분 문자열의 길이
        for (int len = 1; len <= n; len++) {

            for (int i = 0; i + len - 1 < n; i++) {

                int j = i + len - 1;

                // 길이 1
                if (len == 1) {
                    dp[i][j] = true;
                }

                // 길이 2
                else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }

                // 길이 3 이상
                else {
                    dp[i][j] =
                        s.charAt(i) == s.charAt(j)
                        && dp[i + 1][j - 1];
                }

                // 팰린드롬이고 기존 최대보다 길다면 갱신
                if (dp[i][j] && len > maxLength) {
                    maxLength = len;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}