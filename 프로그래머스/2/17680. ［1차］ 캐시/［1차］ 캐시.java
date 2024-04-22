import java.util.*;
import java.io.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> q = new LinkedList<>();
        
        if(cacheSize == 0){ 
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if(q.contains(city)) {
                q.remove(city);
                q.add(city);
                answer += 1;
            } else {
                if(q.size() < cacheSize) {
                    q.add(city);
                    answer += 5;
                } else {
                    q.poll();
                    q.add(city);
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
}