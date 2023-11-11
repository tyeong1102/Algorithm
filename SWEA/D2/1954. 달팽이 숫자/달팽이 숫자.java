import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t, n, dir;
    public static int[][] arr;
    public static boolean[][] visited;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            visited = new boolean[n][n];

            dir = 0;
            int x = 0;
            int y = 0;

            for (int i = 1; i <= n * n; i++) {
                arr[x][y] = i;
                visited[x][y] = true;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny] == true) {
                    dir = (dir + 1) % 4;
                }

                x = x + dx[dir];
                y = y + dy[dir];
            }


            System.out.println("#" + test_case );
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}