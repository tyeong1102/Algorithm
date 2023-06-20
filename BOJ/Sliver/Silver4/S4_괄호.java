import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    st.push(c);
                }

                if (c == ')') {
                    if (st.isEmpty()) {
                        st.push(c);
                        break; // 더 이상 입력을 하여도 짝이 안맞기 때문
                    } else {
                        st.pop(); // 짝이 맞기 때문에 pop
                    }
                }
            }

            if (st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            st.clear(); // 한 문자열이 끝나면 스택을 비워줘야 다음 문자열에 영향을 안줌
        }
    }
}