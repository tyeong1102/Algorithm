import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, x, y, ret;
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());


            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j]) {
                    ret++;
                }
            }
        }

        System.out.println(ret);
    }
}