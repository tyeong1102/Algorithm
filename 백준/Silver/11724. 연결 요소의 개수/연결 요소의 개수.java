import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, u, v, ret;
    public static int[][] arr;
    public static boolean[] visited;

    public static void dfs(int idx) {
        if (visited[idx]) {
            return;
        } else {
            visited[idx] = true;
            for (int i = 1; i <= n; i++) {
                if (arr[idx][i] == 1) {
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            arr[u][v] = arr[v][u] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) {
                dfs(i);
                ret++;
            }
        }

        System.out.println(ret);
    }
}