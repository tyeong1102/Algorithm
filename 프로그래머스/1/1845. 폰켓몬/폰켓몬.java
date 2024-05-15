import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int choose = nums.length / 2;
        
        if(map.size() >= choose) {
            answer = choose;
        } else {
            answer = map.size();
        }
        
        return answer;
    }
}