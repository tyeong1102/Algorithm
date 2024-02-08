import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, k;
    public static int[] arr;

    public static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        arr[n] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next == k) {
                    System.out.println(arr[now]);
                    return;
                }

                if (next < 0 || next >= arr.length) continue;
                if (arr[next] == 0) {
                    q.add(next);
                    arr[next] = arr[now] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[100001];

        if (n == k) {
            System.out.println(0);
        } else {
            bfs(n);
        }
    }
}