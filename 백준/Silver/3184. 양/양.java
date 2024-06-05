import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int r, c;
    public static char[][] arr;
    public static boolean[][] visited;
    public static int[] ans = new int[2];

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int[] dfs(int x, int y) {
        visited[x][y] = true;

        if (arr[x][y] == 'o') {
            ans[0]++;
        }
        if (arr[x][y] == 'v') {
            ans[1]++;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
            if (visited[nx][ny] || arr[nx][ny] == '#') continue;

            dfs(nx, ny);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new char[r][c];
        visited = new boolean[r][c];

        int s = 0;
        int w = 0;

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && arr[i][j] != '#') {
                    ans[0] = ans[1] = 0;
                    int[] x = dfs(i, j);
                    if (!(x[0] == 0 && x[1] == 0)) {
                        if (x[1] >= x[0]) {
                            w += x[1];
                        } else if (x[1] < x[0]) {
                            s += x[0];
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s).append(" ").append(w);
        System.out.println(sb);
    }

}