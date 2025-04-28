class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, -1);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count--;
            }
            if(map.containsKey(count)){
                sum = Math.max(sum, i-map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        return sum;

    }
}