import java.io.*;
import java.util.Stack;

public class boj_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Stack<Character> s = new Stack<>();
            String str = br.readLine() + "\n";
            for (char c : str.toCharArray()) {
                if (c == ' ' || c == '\n') {
                    while (!s.isEmpty()) {
                        bw.write(s.pop());
                    }
                    bw.write(c);
                } else {
                    s.push(c);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
