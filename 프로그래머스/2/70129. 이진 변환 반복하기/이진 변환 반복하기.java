import java.util.*;
import java.io.*;

class Solution {
    public static int cnt, one, zero;
    
    public int[] solution(String str) {
        
        while(str.length() > 1) {
            one = 0;
            
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            
            str = Integer.toBinaryString(one);
            cnt++;
        }
        
        int[] answer = new int[]{cnt, zero};
        
        return answer;
    }
}