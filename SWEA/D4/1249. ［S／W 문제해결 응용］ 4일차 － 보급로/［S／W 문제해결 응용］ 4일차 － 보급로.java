import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int t, n, min;
    public static int[][] arr;
    public static int[][] ret;
    public static boolean[][] visited;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];

            if (cx == n - 1 && cy == n - 1) {
                min = min > ret[n - 1][n - 1] ? ret[n - 1][n - 1] : min;
            }

            if(min <= ret[cx][cy]) continue;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (!visited[nx][ny] || ret[nx][ny] > ret[cx][cy] + arr[nx][ny]) {
                    q.add(new int[]{nx, ny});
                    ret[nx][ny] = ret[cx][cy] + arr[nx][ny];
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());

            arr = new int[n + 1][n + 1];
            visited = new boolean[n + 1][n + 1];
            ret = new int[n + 1][n + 1];

            min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            for (int i = 0; i < n; i++) {
                Arrays.fill(ret[i], Integer.MAX_VALUE);
            }

            ret[0][0] = 0;

            bfs(0, 0);

            System.out.println("#" + test_case + " " + min);
        }
    }
}