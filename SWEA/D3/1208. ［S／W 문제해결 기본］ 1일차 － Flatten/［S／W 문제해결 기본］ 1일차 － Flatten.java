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

        for (int test_case = 1; test_case <= 10; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[100];
            ret = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            while (n-- > 0) {
                Arrays.sort(arr);

                int num = arr[99] - arr[0];

                if (num <= 1) {
                    ret = 1;
                    break;
                }

                arr[99]--;
                arr[0]++;
            }

            Arrays.sort(arr);
            ret = arr[99] - arr[0];

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");

        }

        System.out.println(sb);
    }
}