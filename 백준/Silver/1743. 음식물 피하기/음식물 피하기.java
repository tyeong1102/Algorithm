import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, k, r, c, area, ret;
    public static int[][] arr;
    public static boolean[][] visited;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= n + 1 || ny < 0 || ny >= m + 1) continue;
            if (!visited[nx][ny] && arr[nx][ny] == 1) {
                area++;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            arr[r][c] = 1;
        }

        area = 1;
        ret = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    ret = Math.max(ret, area);
                    area = 1;
                }
            }
        }

        System.out.println(ret);
    }
}