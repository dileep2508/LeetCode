class Solution {
    public int rob(int[] nums) {
        if(nums == null && nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        return Math.max(robLinear(nums, 0, nums.length -2), robLinear(nums, 1, nums.length -1));
    }
    private int robLinear(int[] nums, int start, int end){
        int dp1 = 0;
        int dp2 = 0;
        for(int i= start; i<=end; i++){
            int temp = dp1;
            dp1 = Math.max(dp2 + nums[i], dp1);
            dp2 = temp;
        }
        return dp1;
    }
}