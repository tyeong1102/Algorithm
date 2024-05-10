import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int k;
    public static int[] arr, ret;
    public static boolean[] visited;
    public static StringBuilder sb;

    public static void go(int s, int cnt) {
        if (cnt == 6) {
            for (int num : ret) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = s; i < k; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ret[cnt] = arr[i];
                go(i, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();

            k = Integer.parseInt(st.nextToken());
            arr = new int[k];
            ret = new int[6];
            visited = new boolean[k];

            if (k == 0) {
                break;
            }

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            go(0, 0);

            System.out.println(sb);
        }


    }
}