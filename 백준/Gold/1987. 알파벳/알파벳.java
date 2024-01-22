import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r, c, ret;
    static char[][] map;
    static boolean[] visit = new boolean[26];
    static int[] dr = { -1, 1, 0, 0 };
    static int[] dc = { 0, 0, -1, 1 };

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
        DFS(0, 0, 1);
        System.out.println(ret);
    }

    private static void DFS(int i, int j, int cnt) {
        if (ret < cnt)
            ret = cnt;
        else if (ret == 26)
            return;
        for (int dir = 0; dir < dr.length; dir++) {
            int nr = i + dr[dir];
            int nc = j + dc[dir];

            if (isRange(nr, nc) && !visit[map[nr][nc] - 'A']) {
                visit[map[nr][nc] - 'A'] = true;
                DFS(nr, nc, cnt + 1);
                visit[map[nr][nc] - 'A'] = false;
            }
        }

    }

    private static boolean isRange(int nr, int nc) {
        if (0 <= nr && nr < r && 0 <= nc && nc < c)
            return true;
        return false;
    }
}