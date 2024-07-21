import java.util.*;
import java.io.*;

class Solution {
    public static int n, m;
    public static int[][] visited;
    
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        visited = new int[n][m];
        
        bfs(maps, visited);
        
        answer = visited[n - 1][m - 1];
        
        if (answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
    
    public static void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[cx][cy] + 1;
                    q.add(new int[]{nx, ny});
                }
            }    
        }
    }
}