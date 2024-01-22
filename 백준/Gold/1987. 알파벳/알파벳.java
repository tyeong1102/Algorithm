import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int r, c, ret;
    public static char[][] map;
    public static boolean[] visit = new boolean[26];
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        ret = 0;

        visit[map[0][0] - 'A'] = true;
        dfs(0, 0, 1);
        System.out.println(ret);
    }

    private static void dfs(int x, int y, int cnt) {
        if (ret < cnt)
            ret = cnt;
        else if (ret == 26)
            return;
        for (int dir = 0; dir < dx.length; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
                if (!visit[map[nx][ny] - 'A']) {
                    visit[map[nx][ny] - 'A'] = true;
                    dfs(nx, ny, cnt + 1);
                    visit[map[nx][ny] - 'A'] = false;
                }
            }
        }
    }
}