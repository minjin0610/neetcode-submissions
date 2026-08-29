class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        int n = seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        int answer = 0;

        for (int i=0; i<n; i++) {
            answer += Math.abs(seats[i]-students[i]);
        }
        
        return answer;
    }
}

// n개의 자리가 있고 n명의 학생이 방에 서있음
// seat[i]는 i번째 자리를 의미
// studenst[j]는 j번째 학생의 위치를 의미
// i번쨰 학생의 위치를 1씩 옮겨라 (+1 또는 -1)
// 두 학생이 같은 자리에 있지 않게 만들 수 있는 최소한의 이동 횟수를 반환하라

