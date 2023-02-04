import java.io.*;
import java.util.Stack;

public class boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    s.push(c);
                } else {
                    if (s.size() == 0) {
                        s.push(c);
                        break;
                    } else {
                        s.pop();
                    }
                }
            }
            if (s.isEmpty()) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
            s.clear();
        }

        bw.flush();
        bw.close();
    }
}
