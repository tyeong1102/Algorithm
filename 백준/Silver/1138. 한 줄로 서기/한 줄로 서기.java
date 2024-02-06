import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, num;
    public static int[] arr;
    public static int[] ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        ret = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            num = 1;

            while (true) {
                if (arr[i] == 0 && ret[num] == 0) {
                    ret[num] = i;
                    break;
                } else if (ret[num] == 0) {
                    arr[i]--;
                }

                num++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(ret[i]).append(" ");
        }

        System.out.println(sb);
    }
}