import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int back = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    back = num;
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(q.poll() + "\n");
                    }
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                    break;
                case "front":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peek() + "\n");
                    break;
                case "back":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(back + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}