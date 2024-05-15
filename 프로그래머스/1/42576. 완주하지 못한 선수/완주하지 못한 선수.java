import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(String str : completion) {
            map.put(str, map.get(str) - 1);
        }
        
        ArrayList<String> list = new ArrayList<>(map.keySet());
        
        for(String name : list) {
            if(map.get(name) >= 1) {
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}