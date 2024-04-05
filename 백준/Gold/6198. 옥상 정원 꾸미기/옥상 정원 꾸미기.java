import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int n, h;
    public static long ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            h = Integer.parseInt(br.readLine());

            while (!s.isEmpty()) {
                if (s.peek() <= h) {
                    s.pop();
                } else {
                    break;
                }
            }

            ret += s.size();
            s.push(h);
        }

        System.out.println(ret);

    }
}