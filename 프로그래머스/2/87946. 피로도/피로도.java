import java.util.*;
import java.io.*;

class Solution {
    public static int answer;
    public static boolean[] visited;
    
    public static void go(int depth, int fatigue, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }
            
            visited[i] = true;
            go(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        
        answer = Math.max(answer, depth);
    }
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        
        go(0, k, dungeons);
        
        return answer;
    }
}