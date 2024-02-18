import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int ret;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> st = new Stack<>();

        str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                st.push(c);
            } else {
                st.pop();
                if (str.charAt(i - 1) == '(') {
                    ret += st.size();
                } else {
                    ret++;
                }
            }
        }

        System.out.println(ret);
    }
}