import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n;
    public static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[n-1];
            long ret = 0;

            for (int i = n - 2; i >= 0; i--) {
                if (max > arr[i]) {
                    ret += (max - arr[i]);
                } else {
                    max = arr[i];
                }
            }

            sb.append("#").append(test_case).append(" ").append(ret).append('\n');
        }
        System.out.println(sb);
    }
}