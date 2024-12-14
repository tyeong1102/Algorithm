import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[][] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void go(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            sb.append(arr[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        go(x, y, newSize);
        go(x, y + newSize, newSize);
        go(x + newSize, y, newSize);
        go(x + newSize, y + newSize, newSize);

        sb.append(')');

    }

    public static boolean isPossible(int x, int y, int size) {
        int num = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

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