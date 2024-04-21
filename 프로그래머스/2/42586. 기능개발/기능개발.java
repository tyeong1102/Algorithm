import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int num = 100 - progresses[i];
            int day = num / speeds[i];
            if(num % speeds[i] != 0) {
                day++;
            }
            
            q.add(day);
        }
        
        int max = q.peek();
        int cnt = 0;
        
        while(!q.isEmpty()) {
            if(max >= q.peek()) {
                cnt++;
                q.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                max = q.poll();
            }
        }
        
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}