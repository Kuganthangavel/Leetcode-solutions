import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, result, list, 0);
        return result;
    }

    private void solve(int[] nums, List<List<Integer>> result, List<Integer> list, int index) {
        if (index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        solve(nums, result, list, index + 1);
        list.remove(list.size() - 1);
        solve(nums, result, list, index + 1);
    }
}
