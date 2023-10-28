import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[2][7];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[s][y]++;
        }

        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 7; j++) {
                cnt += arr[i][j] / k;
                if (arr[i][j] % k != 0) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}