import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int com, n;
    static int cnt = 0;

    public static void dfs(int s) {
        visited[s] = true;

        for(int i = 1; i <= com; i++) {
            if(arr[s][i] == 1 && !visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        com = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        arr = new int[com + 1][com + 1];
        visited = new boolean[com + 1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u][v] = arr[v][u] = 1;
        }

        dfs(1);

        System.out.println(cnt);
    }
}