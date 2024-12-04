import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            Queue<Character> q = new LinkedList<>();
            String str = br.readLine();

            if (str.charAt(0) == ')') {
                sb.append("NO").append("\n");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (c == '(') {
                        q.add(c);
                    } else {
                        if(!q.isEmpty() && q.peek() == '(') {
                            q.poll();
                        } else {
                            q.add(c);
                        }
                    }
                }

                if (!q.isEmpty()) {
                    sb.append("NO").append("\n");
                } else {
                    sb.append("YES").append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}