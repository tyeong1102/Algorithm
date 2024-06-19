import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, idx;
    public static char[][] arr;

    public static void go(int x, int y, int idx) {
        if (idx == 1) {
            arr[x][y] = '*';
            return;
        }

        int half = idx / 2;
        go(x, y, half);
        go(x + half, y, half);
        go(x, y + half, half);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        idx = (int) Math.pow(2, n);
        arr = new char[idx][idx];

        go(0, 0, idx);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx; j++) {
                if (j == idx - i) {
                    break;
                }
                if (arr[i][j] == '*') {
                    sb.append(arr[i][j]);
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}