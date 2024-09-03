import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int[][] giftGraph = new int[friends.length][friends.length];
        int[] giftScore = new int[friends.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for ( int i = 0; i < friends.length; i++ ) {
            map.put(friends[i], i);
        }
        
        for ( String gift : gifts ) {
            String[] name = gift.split(" ");
            String from = name[0];
            String to = name[1];
            
            giftScore[map.get(from)]++;
            giftScore[map.get(to)]--;
            giftGraph[map.get(from)][map.get(to)]++;    
        }
        
        for ( int i =0; i< friends.length; i++) {
            int cnt = 0;
            
            for ( int j = 0; j< friends.length; j++) {
                if ( i == j) {
                    continue;
                }    
                
                if (giftGraph[i][j] > giftGraph[j][i] ||
                     (giftGraph[i][j] == giftGraph[j][i] && giftScore[i] > giftScore[j])) {
                        cnt++;
                    }
            }
            
            answer = Math.max(answer, cnt);
            
        }
        
        return answer;
    }
}