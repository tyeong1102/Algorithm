import java.util.*;
import java.io.*;

class Solution {
    public int solution(String str) {
        int answer = -1;

        Stack<Character> s = new Stack<>();
        
        s.push(str.charAt(0));
        
        for(int i = 1; i < str.length(); i++) {
            if(!s.isEmpty() && s.peek() == str.charAt(i)) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }
        
        if(s.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}