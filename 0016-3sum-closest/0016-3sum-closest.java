class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        int near = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(i = 0 ; i < n - 2 ; i++){
             if(i > 0 && nums[i] == nums[i - 1])continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) <= Math.abs(near - target)) {
                    near = sum;
                }
                if (sum < target) {
                    j++;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                } else {
                    k--;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }

        }
          

        return near;    
        }
        
        
    }
