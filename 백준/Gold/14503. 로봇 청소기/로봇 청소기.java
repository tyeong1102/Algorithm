import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, r, c, d, ret;
    public static int[][] arr;
    public static boolean[][] visited;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y, int dir) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            dir = (dir + 3) % 4;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (!visited[nx][ny] && arr[nx][ny] == 0) {
                ret++;
                dfs(nx, ny, dir);
                return;
            }
        }

        int back = (dir + 2) % 4;
        int bx = x + dx[back];
        int by = y + dy[back];

        if(bx >= 0 && bx < n && by >= 0 && by < m && arr[bx][by] == 0) {
            dfs(bx, by, dir);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken()); // 보고있는 방향
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ret = 1;
        
        dfs(r, c, d);

        System.out.println(ret);
    }
}