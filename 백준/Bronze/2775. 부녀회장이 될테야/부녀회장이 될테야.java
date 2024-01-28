import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, k, n;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        arr = new int[15][15];

        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < t; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            System.out.println(arr[k][n]);
        }
    }
}