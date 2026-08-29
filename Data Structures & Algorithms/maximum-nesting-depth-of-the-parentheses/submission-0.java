class Solution {
    public int maxDepth(String s) {
        
        int n = s.length();
        int count = 0;
        int max = 0;

        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '(') {
                count++;
                max = Math.max(max, count);
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }

        return max;
    }
}

// nesting depth를 구하라
// nesting depth는 nested parentheses의 최댓값

// (가 나오면 +1, )가 나오면 -1, 최대로 쌓인 count 값 반환