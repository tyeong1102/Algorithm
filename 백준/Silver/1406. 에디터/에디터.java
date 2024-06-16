import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int m;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        m = Integer.parseInt(br.readLine());

        Stack<String> ls = new Stack<>();
        Stack<String> rs = new Stack<>();

        String[] arr = str.split("");
        for(String s : arr) {
            ls.push(s);
        }

        for(int i = 0; i < m; i++) {
            String input = br.readLine();
            char c = input.charAt(0);

            switch(c) {
                case 'L':
                    if(!ls.isEmpty())
                        rs.push(ls.pop());
                    break;
                case 'D':
                    if(!rs.isEmpty())
                        ls.push(rs.pop());
                    break;
                case 'B':
                    if(!ls.isEmpty()) {
                        ls.pop();
                    }
                    break;
                case 'P':
                    char t = input.charAt(2);
                    ls.push(String.valueOf(t));
                    break;
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!ls.isEmpty()) {
            rs.push(ls.pop());
        }

        while (!rs.isEmpty()) {
            sb.append(rs.pop());
        }

        System.out.println(sb);
    }
}