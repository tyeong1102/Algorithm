import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int l, r, c;
    public static int e1, e2, e3;
    public static char[][][] arr;
    public static int[][][] visited;
    public static boolean[][][] check;
    public static Queue<int[]> q = new LinkedList<>();

    public static int[] dx = {1, 0, -1, 0, 0, 0};
    public static int[] dy = {0, 1, 0, -1, 0, 0};
    public static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void bfs() {
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int z = now[0];
            int x = now[1];
            int y = now[2];
            check[z][x][y] = true;

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nz < 0 || nz >= l || nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                if (arr[nz][nx][ny] != '#' && !check[nz][nx][ny]) {
                    check[nz][nx][ny] = true;
                    visited[nz][nx][ny] = visited[z][x][y] + 1;
                    q.add(new int[]{nz, nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            arr = new char[l][r][c];
            visited = new int[l][r][c];
            check = new boolean[l][r][c];

            if (l == 0 && r == 0 && c == 0) {
                return;
            }

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < r; j++) {
                    String str = br.readLine();
                    for (int k = 0; k < c; k++) {
                        arr[i][j][k] = str.charAt(k);
                    }
                }
                br.readLine();
            }

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        if (arr[i][j][k] == 'S') {
                            q.add(new int[]{i, j, k});
                            visited[i][j][k] = 0;
                        }
                        if (arr[i][j][k] == 'E') {
                            e1 = i;
                            e2 = j;
                            e3 = k;
                            visited[i][j][k] = 0;
                        }
                        if (arr[i][j][k] == '#') {
                            visited[i][j][k] = 1;
                        }
                        if (arr[i][j][k] == '.') {
                            visited[i][j][k] = 0;
                        }
                    }
                }
            }

            bfs();

            if (visited[e1][e2][e3] != 0) {
                System.out.println("Escaped in " + visited[e1][e2][e3] + " minute(s).");
            } else {
                System.out.println("Trapped!");
            }
        }
    }
}