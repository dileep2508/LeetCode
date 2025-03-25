class Solution {

    public boolean isMatchingPair(char t, char c){
        if(t=='(') return c==')';
        if(t=='{') return c=='}';
        return c==']';
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(!isMatchingPair(top, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}