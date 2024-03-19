import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            map.put(i, n);
        }
        
        
        for(int i = 1; i <= map.size(); i++) {
            for(int j = 0; j < map.get(i); j++) {
                answer += Integer.toString(i);
            }
        }
        
        answer += "0";
        
        for(int i = map.size(); i >= 1; i--) {
            for(int j = 0; j < map.get(i); j++) {
                answer += Integer.toString(i);
            }
        }
        
        return answer;
    }
}