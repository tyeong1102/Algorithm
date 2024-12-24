import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            Stack<Character> s = new Stack<>();

            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    s.push(str.charAt(i));
                } else if (str.charAt(i) == ')' || str.charAt(i) == ']') {
                    if (s.isEmpty()) {
                        flag = false;
                        break;
                    }
                }
                
                if (!s.isEmpty() && str.charAt(i) == ')') {
                    if (s.peek() == '(') {
                        s.pop();
                    } else {
                        flag = false;
                        break;
                    }
                } else if (!s.isEmpty() && str.charAt(i) == ']') {
                    if (s.peek() == '[') {
                        s.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (s.isEmpty() && flag) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);

    }
}