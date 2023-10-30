import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int n, cnt;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (arr[nx][ny] >= height && !visited[nx][ny]) {
                dfs(nx, ny, height);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                tmp = Math.max(tmp, arr[i][j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int t = 1; t <= tmp; t++) {
            visited = new boolean[n + 1][n + 1];
            cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] >= t && !visited[i][j]) {
                        dfs(i, j, t);
                        cnt++;
                    }
                }
            }
            list.add(cnt);
        }

        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));

    }
}