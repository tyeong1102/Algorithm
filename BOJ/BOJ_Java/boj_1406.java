import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 마지막 출력 전에 s2.push(s1.pop())을 해줘야하는데 s1.peek()을 넣어서
 * 계속 java heap space 오류가 발생했다.
 */

public class boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            s1.push(str.charAt(i));
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            switch (input.charAt(0)) {
                case 'L':
                    if (!s1.isEmpty()) {
                        s2.push(s1.pop());
                        break;
                    } else {
                        break;
                    }
                case 'D':
                    if (!s2.isEmpty()) {
                        s1.push(s2.pop());
                        break;
                    } else {
                        break;
                    }
                case 'B':
                    if (!s1.isEmpty()) {
                        s1.pop();
                        break;
                    } else {
                        break;
                    }
                case 'P':
                    s1.push(input.charAt(2));
                    break;
            }
        }
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        while (!s2.empty()) {
            sb.append(s2.pop());
        }

        System.out.println(sb.toString());
    }
}
