import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int l, c;
    public static char[] arr, ret;
    public static boolean[] visited;
    public static StringBuilder sb;

    public static void go(int s, int cnt) {
        if (cnt == l) {
            int a = 0;
            int b = 0;

            for (char c : ret) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    a++;
                } else {
                    b++;
                }
            }

            if (a >= 1 && b >= 2) {
                for (char c : ret) {
                    sb.append(c);
                }
                sb.append("\n");
            }
            return;
        }

        for (int i = s; i < c; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ret[cnt] = arr[i];
                go(i + 1, cnt + 1);
                visited[i] = false;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new char[c];
        visited = new boolean[c];
        ret = new char[l];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);

        go(0, 0);

        System.out.println(sb);
    }
}