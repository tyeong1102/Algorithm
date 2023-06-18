import java.io.*;
import java.util.Stack;

public class BOJ_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    s.push(Integer.parseInt(input[1]));
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