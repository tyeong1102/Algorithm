import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n, cnt;
    public static boolean[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();
            n = Integer.parseInt(str);

            arr = new boolean[10];
            cnt = 0;
            int a = 1;

            while (true) {
                for (int i = 0; i < str.length(); i++) {
                    int num = Integer.parseInt(str.substring(i, i + 1));
                    if (!arr[num]) {
                        arr[num] = true;
                        cnt++;
                    }
                }

                if (cnt == 10) {
                    break;
                }
                a++;

                str = Integer.toString(n * a);
            }

            sb.append("#").append(test_case).append(" ").append(str).append("\n");
        }

        System.out.println(sb);
    }
}