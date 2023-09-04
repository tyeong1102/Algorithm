import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
            }

            if (s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }

        if (st.isEmpty()) {
            return answer;
        } else {
            return false;
        }
    }
}