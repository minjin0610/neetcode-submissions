class Solution {

    private List<List<Integer>> subsets;
    private int index;

    public List<List<Integer>> subsets(int[] nums) {
        subsets = new ArrayList<>();
        backtrack(nums, index, new ArrayList<>());
        return subsets;
    }

    private void backtrack(int[] nums, int index, List<Integer> subset) {
        if (index == nums.length) {
            subsets.add(subset);
            return;
        }
        
        List<Integer> selected = new ArrayList<>(subset);
        selected.add(nums[index]);
        backtrack(nums, index+1, selected);

        List<Integer> unSelected = new ArrayList<>(subset);
        backtrack(nums, index+1, unSelected);
    }
}
