import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, k;
    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.peek());
                q.poll();
            }

            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");

        System.out.println(sb);
    }
}