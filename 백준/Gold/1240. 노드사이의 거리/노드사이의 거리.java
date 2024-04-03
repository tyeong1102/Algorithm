import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static int[][] arr, distance;
    public static boolean[] visited;

    public static void bfs(int s, int e, int n) {
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n + 1];

        visited[s] = true;
        q.add(s);
        int[] ret = new int[n + 1];

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 1; i <= n; i++) {
                if (arr[cur][i] == 1 && !visited[i]) {
                    ret[i] += distance[cur][i] + ret[cur];

                    if (i == e) {
                        System.out.println(ret[e]);
                        return;
                    }

                    q.add(i);
                    visited[i] = true;
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
        distance = new int[n + 1][n + 1];


        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());

            arr[u][v] = arr[v][u] = 1;
            distance[u][v] = distance[v][u] = dis;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            bfs(u, v, n);
        }

    }
}