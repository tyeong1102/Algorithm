import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    s.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (s.empty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(s.pop() + "\n");
                    }
                    break;
                case "size":
                    sb.append(s.size() + "\n");
                    break;
                case "empty":
                    if (s.empty()) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                    break;
                case "top":
                    if (s.empty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(s.peek() + "\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}