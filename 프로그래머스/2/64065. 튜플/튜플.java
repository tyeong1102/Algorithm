import java.util.*;
import java.io.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2);
        s = s.replace("},{", "-");
        
        String[] str = s.split("-");
        
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for(String st : str) {
            String[] arr = st.split(",");
            
            for(int i = 0; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);
                
                if(!answer.contains(num)) {
                    answer.add(num);
                }
            }
        }
         
        
        return answer;
    }
}