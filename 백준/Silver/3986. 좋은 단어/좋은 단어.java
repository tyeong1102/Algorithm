import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Stack<Character> s = new Stack<>();
            s.push(str.charAt(0));

            for (int j = 1; j < str.length(); j++) {
                if (!s.isEmpty() && s.peek() == str.charAt(j)) {
                    s.pop();
                } else {
                    s.push(str.charAt(j));
                }
            }

            if (s.isEmpty()) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}