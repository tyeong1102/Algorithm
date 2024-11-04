import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int n, ret;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            str = br.readLine();

            Stack<Character> s = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (!s.isEmpty() && s.peek() == c) {
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