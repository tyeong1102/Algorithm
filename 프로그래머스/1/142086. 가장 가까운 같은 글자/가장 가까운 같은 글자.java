import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(!map.containsKey(c)) {
                answer[i] = -1;
                map.put(c, i);
            } else {
                answer[i] = i - map.get(c);
                map.put(c, i);
            }
        }
        
        return answer;
    }
}