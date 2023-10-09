import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][] a = new int[1004][1004];
    public static boolean[] visited;
    public static int N, M, V;

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && a[node][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            int next = q.poll();
            System.out.print(next + " ");

            for(int i = 1; i <= N; i++) {
                if(a[next][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            a[u][v] = 1;
            a[v][u] = 1;
        }

        visited = new boolean[1004];
        dfs(V);
        System.out.println();
        visited = new boolean[1004];
        bfs(V);

    }
}