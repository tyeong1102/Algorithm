import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int start = 0;

        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());

            if (a > start) {
                for (int i = start + 1; i <= a; i++) {
                    s.add(i);
                    sb.append('+').append('\n');
                }
                start = a;
            } else if (s.peek() != a) {
                System.out.println("NO");
                return;
            }

            s.pop();
            sb.append('-').append('\n');

        }

        System.out.println(sb);
    }
}