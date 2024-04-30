import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static int n, ret;
    public static int[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[100];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                Arrays.sort(arr);

                if (arr[99] - arr[0] == 1) {
                    ret = 1;
                    return;
                }

                if (arr[0] == arr[99]) {
                    ret = 0;
                    return;
                }

                arr[0]++;
                arr[99]--;
            }

            Arrays.sort(arr);
            ret = arr[99] - arr[0];

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}