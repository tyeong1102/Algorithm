import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, zero;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int bfs() {
        int cnt = 0;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];
            cnt = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if (arr[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    arr[nx][ny] = 1;
                    zero--;
                    q.add(new int[]{nx, ny, cnt + 1});
                }
            }
            if (q.isEmpty() && zero == 0) {
                return cnt;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1) {
                    visited[i][j] = true;
                    q.add(new int[] {i, j, 0});
                } else if (arr[i][j] == 0) {
                    zero++;
                }
            }
        }

        System.out.println(bfs());
    }
}