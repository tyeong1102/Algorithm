import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[][] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void go(int x, int y, int len) {
        boolean flag = true;
        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (arr[x][y] != arr[i][j]) {
                    flag = false;
                }
            }
        }

        if (flag) {
            sb.append(arr[x][y]);
        } else {
            int newLen = len / 2;

            sb.append('(');

            go(x, y, newLen);
            go(x, y + newLen, newLen);
            go(x + newLen, y, newLen);
            go(x + newLen, y + newLen, newLen);

            sb.append(')');
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        go(0, 0, n);

        System.out.println(sb);

    }
}