class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;

        for(int a: nums){

            ans = ans^a; 
        }

        return ans;
    }
}