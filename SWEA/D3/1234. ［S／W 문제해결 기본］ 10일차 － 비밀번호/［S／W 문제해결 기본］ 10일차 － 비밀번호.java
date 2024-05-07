import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public static int n;
    public static String str;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            Stack<Character> s = new Stack<>();

            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);

                if (!s.isEmpty() && c == s.peek()) {
                    s.pop();
                } else {
                    s.add(c);
                }
            }

            String tmp = "";
            while (!s.isEmpty()) {
                tmp += s.pop();
            }

            StringBuffer buffer = new StringBuffer(tmp);
            String ret = buffer.reverse().toString();

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}