class Solution {
    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();
        while(! res.contains(n)){
            res.add(n);
            int sum = 0;
            while(n != 0){
                int temp = n%10;
                sum += temp*temp;
                n = n/10;
            }
            n = sum;
        }
        return n==1;
    }
}