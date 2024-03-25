// 구명보트에는 최대 2명, 무게 제한
// 보트를 최대한 적게 사용해서 구출
import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] people, int limit) {
    
        int answer = 0;
        
        Arrays.sort(people);
        
        int s = 0;
        int e = people.length - 1;
        
        while(s <= e) {
            if(people[s] + people[e] <= limit) {
                s++;
            }
            
            e--;
            answer++;
        }
        
        return answer;
    }
}