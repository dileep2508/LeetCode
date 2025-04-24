class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int curr = 1;
        int index = 0;
        while(true){
            if(index < arr.length && arr[index] == curr){
                index++;
            }
            else{
                missingCount++;
                if(missingCount == k){
                    return curr;
                }
            }
            curr++;
        }
    }
}