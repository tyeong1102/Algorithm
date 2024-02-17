import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int m, n, h;
    public static int[][][] arr;
    public static Queue<int[]> q = new LinkedList<>();

    public static int dx[] = {1, 0, -1, 0, 0, 0};
    public static int dy[] = {0, 1, 0, -1, 0, 0};
    public static int dz[] = {0, 0, 0, 0, 1, -1};

    public static void bfs() {
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int z = now[0];
            int x = now[1];
            int y = now[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nz < 0 || nz >= h || nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[nz][nx][ny] == 0) {
                    q.add(new int[]{nz, nx, ny});
                    arr[nz][nx][ny] = arr[z][x][y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[h + 1][n + 1][m + 1];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        q.add(new int[]{i, j, k});
                    }
                }
            }
        }

        bfs();

        int ret = Integer.MIN_VALUE;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    } else {
                        ret = Math.max(ret, arr[i][j][k]);
                    }
                }
            }
        }

        System.out.println(ret - 1);

    }
}