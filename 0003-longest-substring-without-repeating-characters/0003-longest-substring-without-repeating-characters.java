class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlength = 0;
        Set<Character> ch = new HashSet<>();
        int left = 0;
        for(int right = 0; right<n; right++){
            if(!ch.contains(s.charAt(right))){
                ch.add(s.charAt(right));
                maxlength = Math.max(maxlength, right - left + 1);
            }
            else{
                while(ch.contains(s.charAt(right))){
                    ch.remove(s.charAt(left));
                    left++;
                }
                ch.add(s.charAt(right));
            }
        }
        return maxlength;
    }
}