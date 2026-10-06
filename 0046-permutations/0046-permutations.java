class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, current, used, ans);

        return ans;
    }

    public void backtrack(
        int[] nums,
        List<Integer> current,
        boolean[] used,
        List<List<Integer>> ans
    ) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            current.add(nums[i]);
            used[i] = true;

   
            backtrack(nums, current, used, ans);

            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}