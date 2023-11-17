import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, k;
    public static double[] arr;
    public static String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new double[n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int mid = Integer.parseInt(st.nextToken());
                int fin = Integer.parseInt(st.nextToken());
                int assign = Integer.parseInt(st.nextToken());

                arr[i] = 0.35 * mid + 0.45 * fin + 0.2 * assign;
            }

            double target = arr[k - 1];

            Arrays.sort(arr);

            String ret = "";
            for (int i = 0; i < n; i++) {
                if (target == arr[i]) {
                    ret = score[i / (n / 10)];
                    break;
                }
            }
            System.out.println("#" + test_case + " " + ret);
        }
    }
}