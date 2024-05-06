import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n, ret;
    public static int[] arr;

    public static void go(int cnt) {
        if (cnt == n) {
            ret++;
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < cnt; j++) {
                if (arr[j] == i || i == arr[j] + (cnt - j) || i == arr[j] - (cnt - j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                arr[cnt] = i;
                go(cnt + 1);
            }
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            ret = 0;
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            go(0);

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}