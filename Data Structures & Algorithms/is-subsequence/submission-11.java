class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0) {
            return true;
        } 
        
        if (t.length() == 0) {
            return false;
        }

        char[] arr = t.toCharArray();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < arr.length; i++) {
            if (sb.length() == 0) {
                return true;
            }
            if (arr[i] == sb.charAt(0)) {
                sb.deleteCharAt(0);
            }
        }

        return sb.length() == 0;
    }
}

// 두 문자열 s,t 주어짐, s가 t의 순서부분집합이면 t 아니면 f return