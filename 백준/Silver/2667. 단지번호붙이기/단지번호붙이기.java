import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] arr;
    static int[] aparts;
    static boolean[][] visited;
    static int n;
    static int area = 0;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[area]++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if(arr[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        aparts = new int[n * n];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    area++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(aparts);

        StringBuilder sb = new StringBuilder();

        sb.append(area).append("\n");
        for(int i = 0; i < aparts.length; i++) {
            if(aparts[i] != 0) {
                sb.append(aparts[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}