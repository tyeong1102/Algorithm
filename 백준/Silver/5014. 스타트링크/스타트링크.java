import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int f, s, g, u, d;
    public static int[] arr;

    public static void bfs(int f, int s, int g, int u, int d) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        arr[s] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == g) {
                System.out.println(arr[now] - 1);
            }
            if (now + u <= f && arr[now + u] == 0) {
                arr[now + u] = arr[now] + 1;
                q.add(now + u);
            }
            if (now - d > 0 && arr[now - d] == 0) {
                arr[now - d] = arr[now] + 1;
                q.add(now - d);
            }
        }

        if (arr[g] == 0) {
            System.out.println("use the stairs");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        f = Integer.parseInt(st.nextToken()); // 총 층수
        s = Integer.parseInt(st.nextToken()); // 강호가 있는 층수
        g = Integer.parseInt(st.nextToken()); // 스타트링크의 층수
        u = Integer.parseInt(st.nextToken()); // 위로 u층 이동
        d = Integer.parseInt(st.nextToken()); // 아래로 d층 이동

        arr = new int[f + 1];

        bfs(f, s, g, u, d);
    }
}