class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            Arrays.sort(nums);
        } else {
            int next = Integer.MAX_VALUE, nextidx = -1;
            for (int i = idx + 1; i < n; i++) {
                if (nums[idx] < nums[i] && nums[i] < next) {
                    next = nums[i];
                    nextidx = i;
                }
            }

            int temp = nums[idx];
            nums[idx] = nums[nextidx];
            nums[nextidx] = temp;

            Arrays.sort(nums, idx + 1, n);
        }

    }
}