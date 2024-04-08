class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[2];
        dp[1] = nums[0];
        for(int i = 1; i< nums.length; i++){
            int temp = dp[1];
            dp[1] = Math.max(dp[1], dp[0] + nums[i]);
            dp[0] = temp;
        }
        return dp[1];
    }
}
/**
如果要偷当前间，那么就不能偷当前的左边，所以dp公式为: dp[j] = Math.max(dp[j -  1], dp[j - 2] + nums[j]);
O(N), O(1)
 */
