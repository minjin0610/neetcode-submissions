class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int n = s.length();
        Integer[] arr = new Integer[n];
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int value : arr) {
            sb.append(value);
        }

        char first = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(first);

        return sb.toString();

    }
}

// 1을 하나 이상 포함하는 문자열 s 주어짐
// 최대값 홀수 이진수 되도록 비트 재배열해야함
// 결과 문자열 앞에 0 올 수 있음
