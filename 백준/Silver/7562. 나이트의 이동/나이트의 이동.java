import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[][] visited;
    static int t, n, sa, sb, ea, eb;

    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (arr[nx][ny] == 0 && !visited[nx][ny]) {
                    q.add(new int[]{nx, ny});
                    arr[nx][ny] = arr[cx][cy] + 1;
                    visited[nx][ny] = true;
                }

                if(nx == ea && ny == eb) break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            arr = new int[n + 1][n + 1];
            visited = new boolean[n + 1][n + 1];

            st = new StringTokenizer(br.readLine());
            sa = Integer.parseInt(st.nextToken());
            sb = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            ea = Integer.parseInt(st.nextToken());
            eb = Integer.parseInt(st.nextToken());

            bfs(sa, sb);

            if (sa == ea && sb == eb) {
                System.out.println(0);
            } else {
                System.out.println(arr[ea][eb]);
            }
        }
    }
}