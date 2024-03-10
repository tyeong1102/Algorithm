import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String str) {
        boolean answer = true;

        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(') {
                s.push(c);
            } else {
                if(s.isEmpty()) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        
        if(!s.isEmpty()) {
            return false;
        }

        return answer;
    }
}