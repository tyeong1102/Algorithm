import java.io.*;
import java.util.Stack;

public class boj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        int start = 1;

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());

            while (start <= n) {
                s.push(start);
                start++;
                sb.append("+").append('\n');
            }

            if (s.peek() == n) {
                s.pop();
                sb.append("-").append('\n');
            }
        }
        if (s.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
