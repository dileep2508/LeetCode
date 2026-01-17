import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];
        boolean[] used = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (used[idx]) continue;

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && lastIndex[stack.peek() - 'a'] > i) {
                used[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            used[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
