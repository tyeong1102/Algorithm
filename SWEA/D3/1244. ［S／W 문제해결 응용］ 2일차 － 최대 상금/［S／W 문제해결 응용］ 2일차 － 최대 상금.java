import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, change, ret;
    public static String[] arr;

    public static void dfs(int s, int cnt) {
        if (cnt == change) {
            String str = "";
            for (String st : arr) {
                str += st;
            }

            ret = Math.max(ret, Integer.parseInt(str));
            return;
        }

        for (int i = s; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                dfs(i, cnt + 1);

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr = st.nextToken().split("");
            change = Integer.parseInt(st.nextToken());
            ret = 0;

            if (arr.length < change) {
                change = arr.length;
            }

            dfs(0, 0);

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}