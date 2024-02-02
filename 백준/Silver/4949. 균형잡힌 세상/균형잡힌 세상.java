import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<Character> st = new Stack<>();
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    st.push(str.charAt(i));
                } else if (c == ')' || c == ']') {
                    if (st.isEmpty() || (st.peek() == '(' && c == ']') || (st.peek() == '[' && c == ')')) {
                        st.push(c);
                        break;
                    }
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }


        }
    }
}