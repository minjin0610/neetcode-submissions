class Solution {

    private int total;

    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return total;
    }

    private void backtrack(int[] nums, int index, int currentXor) {
        // 리프 노드에 닿은 경우
        if (index == nums.length) {
            total += currentXor;
            return;
        }
        
        // 포함하는 경우
        backtrack(nums,index+1, currentXor ^ nums[index]);

        // 포함하지 않는 경우
        backtrack(nums,index+1, currentXor);
    }
}

// XOR total은 모든 요소들의 XOR 연산, 배열이 비었으면 0
// e.g. [2, 5, 6] 배열의 XOR total은 2 XOR 5 XOR 6 = 1
// nums 배열이 주어지면 배열의 모든 부분 집합 배열의 XOR total의 합을 구하라
// 같은 요소를 가진 부분 집합은 여러 번 집계될 수 있음