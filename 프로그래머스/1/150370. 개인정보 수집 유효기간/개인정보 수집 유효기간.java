// 약관 마다 유효기간 있음
// 모든 달은 28일
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        // today split - "."
        String[] date = today.split("\\.");
        
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        System.out.println(year + " " + month + " " + day);
        
        // terms split - " "
        for(String term : terms) {
            String[] tmp = term.split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        // privacies split - " ", "."
        
        for(int i = 0; i < privacies.length; i++) {
            // " "
            String[] rule = privacies[i].split(" ");
            
            System.out.println(rule[1]);
            
            // "."
            String[] nDate = rule[0].split("\\.");
            
            int nYear = Integer.parseInt(nDate[0]);
            int nMonth = Integer.parseInt(nDate[1]);
            int nDay = Integer.parseInt(nDate[2]);
            
            System.out.println(nYear + " " + nMonth + " " + nDay);
            
            int retY = nYear;
            int retM = nMonth + map.get(rule[1]);
            int retD = nDay;
            
            while (retM > 12) {
                retY += 1;
                retM -= 12;
            }
            
            System.out.println(retY + " " + retM + " " + retD);
            
            if(retY < year || (retY == year && retM < month) || (retY == year && retM == month && retD <= day)) {
                list.add(i + 1);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}