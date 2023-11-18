import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n;
    public static int[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.println("#" + test_case);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[n - j - 1][i]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr[n - i - 1][n - j - 1]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][n-i-1]);
                }
                System.out.println();
            }
        }
    }
}