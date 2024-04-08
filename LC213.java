class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 1), robHelper(nums, 1, nums.length));
    }
    private int robHelper(int[] nums, int start, int end){
        int dp1 = 0;
        int dp2 = 0;
        for(int i = start; i < end; i++){
            int temp = dp2;
            dp2 = Math.max(dp2, dp1 + nums[i]);
            dp1 = temp;
        }
        return dp2;
    }
}
/**
把房屋分为两个部分，含首不含尾和含尾不含首
O(N), O(1)
 */
