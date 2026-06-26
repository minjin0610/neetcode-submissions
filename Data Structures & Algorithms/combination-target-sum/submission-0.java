class Solution {

    private List<List<Integer>> combinationSum;



    public List<List<Integer>> combinationSum(int[] nums, int target) {
        combinationSum = new ArrayList<>();
        backtrack(nums, 0, target, new ArrayList<>());
        return combinationSum;
    }

    private void backtrack(int[] nums, int index, int remain, List<Integer> combination) {

        if (remain == 0) {
            combinationSum.add(new ArrayList<>(combination));
            return;
        }

        // target을 초과한 경우
        if (remain < 0) {
            return;
        }

        // 포함시키는 경우
        for (int i = index; i < nums.length; i++) {
            combination.add(nums[i]);
            backtrack(nums, i, remain - nums[i], combination);
            combination.remove(combination.size()-1);
        }

    }


}

// nums와 target 정수가 주어짐
// 합이 target이 되는 고유한 조합의 경우의 수의 리스트를 반환하라
// 같은 숫자를 여러번 선택할 수 있다
// 만약 각 숫자가 선택된 수가 같으면 두 조합은 같고, 그렇지 않다면 다르다
// 반환하는 조합의 순서는 상관없다

// 같은 숫자를 계속 반복할 수 있으니 같은 인덱스에 계속 머무르며 add한다
// 같은 숫자를 반복해서 더했을때 target과 같으면 종료하고 최종 subset에 더하기
// target보다 작으면 계속 그 숫자로 index 변환 없이 반복
// target보다 크면                                                            