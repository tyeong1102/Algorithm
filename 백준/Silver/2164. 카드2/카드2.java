import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (true) {
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            q.poll();
            int num = q.peek();
            q.poll();
            q.add(num);
        }
    }
}