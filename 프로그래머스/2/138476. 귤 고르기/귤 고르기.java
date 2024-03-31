// 수확한 귤 중 k개 골라 담기
// 귤의 크기가 최대한 비슷하게 선별

import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        for (Integer i : list) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(i);
        }
        
        return answer;
    }
}