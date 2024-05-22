import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            Stack<Character> s = new Stack<>();
            String str = br.readLine();

            s.push(str.charAt(0));

            for(int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!s.isEmpty() && c == s.peek()) {
                    s.pop();
                } else {
                    s.push(c);
                }
            }

            if (s.isEmpty()) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}