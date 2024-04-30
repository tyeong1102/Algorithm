import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int n, ret;
    public static int[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            ret = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n - 2; i++) {
                int num = arr[i];
                int min = Integer.MAX_VALUE;
                for (int j = i - 2; j < i; j++) {
                    min = Math.min(min, num - arr[j]);
                }

                for (int j = i + 1; j <= i + 2; j++) {
                    min = Math.min(min, num - arr[j]);
                }

                if (min > 0) {
                    ret += min;
                }
            }
            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}