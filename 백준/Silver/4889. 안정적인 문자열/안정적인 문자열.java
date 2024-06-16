import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static String str;
    public static int ret, tc;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            ret = 0;
            tc++;
            str = br.readLine();
            if (str.contains("-")) {
                break;
            }

            Stack<Character> s = new Stack<>();
            for(int i = 0; i< str.length(); i++) {
                char c = str.charAt(i);

                if (c == '{') {
                    s.add(c);
                } else {
                    if (s.isEmpty()) {
                        ret++;
                        s.push('{');
                    } else {
                        s.pop();
                    }
                }
            }

            if (!s.isEmpty()) {
                ret += s.size() / 2;
            }

            sb.append(tc).append(".").append(" ").append(ret).append("\n");

        }

        System.out.println(sb);
    }
}