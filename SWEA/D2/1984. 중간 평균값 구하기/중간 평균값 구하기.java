import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static int t;
    public static int[] arr;
    public static double ret;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            arr = new int[10];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int sum = 0;

            for (int i = 1; i < 9; i++) {
                sum += arr[i];
            }

            ret = (double) sum / 8;

            sb.append("#").append(test_case).append(" ").append(Math.round(ret)).append("\n");
        }

        System.out.println(sb);
    }
}