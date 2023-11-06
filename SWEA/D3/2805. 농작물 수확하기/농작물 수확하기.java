import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution
{
    static int[][] arr;

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            int s = n / 2;
            int e = n / 2;
            int ret = 0;

            for (int i = 0; i < n / 2; i++) {
                for (int j = s; j <= e; j++) {
                    ret += arr[i][j];
                }
                s--;
                e++;
            }

            for (int i = n / 2; i < n; i++) {
                for (int j = s; j <= e; j++) {
                    ret += arr[i][j];
                }
                s++;
                e--;
            }

            System.out.println("#" + test_case + " " + ret);
        }
    }
}