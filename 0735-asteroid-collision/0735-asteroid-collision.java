class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int asteroid : asteroids ){
            boolean ans = true;
            while(!s.isEmpty() && asteroid < 0 && s.peek()>0){
                if(s.peek() < -asteroid){
                    s.pop();
                    continue;
                }
                else if(s.peek() == -asteroid){
                    s.pop();
                }
                ans =false;
                break;  
            }
            if(ans){
                    s.push(asteroid);
            }
            }

            int[] res = new int [s.size()];
            for(int i=s.size()-1; i>=0; i--){
                res[i] = s.pop();
            }
            return res;
        }
    
    
}