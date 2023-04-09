import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        sb.append("<");
        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.peek());
                q.poll();
            }
            sb.append(q.poll() + ", ");
        }
        sb.append(q.poll() + ">");

        System.out.println(sb);
    }
}