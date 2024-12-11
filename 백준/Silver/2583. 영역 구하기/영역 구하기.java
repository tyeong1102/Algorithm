import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int m, n, k, x1, y1, x2, y2, area, cnt;
    public static int[][] arr;
    public static boolean[][] visited;
    public static List<Integer> list = new ArrayList<>();

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (!visited[nx][ny] && arr[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];

        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0 && !visited[i][j]) {
                    dfs(i, j);
                    area++;
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        sb.append(area).append("\n");

        for (int num : list) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);

    }
}