class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        
        if(s.length() < 10){
            return res;
        }
        for(int i=0; i <= s.length() - 10; i++){
            String sequence = s.substring(i, i + 10);
            if(seen.contains(sequence)){
                repeated.add(sequence);
            }
            else{
                seen.add(sequence);
            }
        }
        res.addAll(repeated);
        return res;
    }
}