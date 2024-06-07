import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, white, blue, wRet, bRet;
    public static char[][] arr;
    public static boolean[][] visited;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void wDfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (!visited[nx][ny] && arr[nx][ny] == 'W') {
                white++;
                wDfs(nx, ny);
            }
        }
    }

    public static void bDfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (!visited[nx][ny] && arr[nx][ny] == 'B') {
                blue++;
                bDfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        white = 1;
        blue = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'W' && !visited[i][j]) {
                    wDfs(i, j);
                    wRet += (white * white);
                    white = 1;
                } else if (arr[i][j] == 'B' && !visited[i][j]) {
                    bDfs(i, j);
                    bRet += (blue * blue);
                    blue = 1;
                }
            }
        }

        System.out.println(wRet + " " + bRet);
    }
}