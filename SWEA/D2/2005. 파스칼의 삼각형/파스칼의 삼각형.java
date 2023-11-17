import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;
    public static int[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}