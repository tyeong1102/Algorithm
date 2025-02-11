import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, ret;
    public static boolean[] visited;
    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        visited = new boolean[100001];
        q.add(n);
        visited[n] = true;

        while (true) {
            ret++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                visited[x] = true;

                if (x - 1 == k || x + 1 == k || x * 2 == k) {
                    System.out.println(ret);
                    return;
                }
                if (x - 1 >= 0 && !visited[x - 1]) {
                    visited[x - 1] = true;
                    q.add(x - 1);
                }
                if (x + 1 <= 100000 && !visited[x + 1]) {
                    visited[x + 1] = true;
                    q.add(x + 1);
                }
                if (x * 2 <= 100000 && !visited[x * 2]) {
                    visited[x * 2] = true;
                    q.add(x * 2);
                }
            }
        }
    }
}