import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, max;
    public static String str;
    public static char[] arr;

    public static void dfs(int start, int cnt) {
        if (cnt == n) {
            String ret = "";
            for (char c : arr) {
                ret += c;
            }
            max = Math.max(max, Integer.parseInt(ret));
            return;
        }

        for(int i = start; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                // swap
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                dfs(i, cnt + 1);	// 깊이 +1
                // 다시 swap 해서 되돌림
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            str = st.nextToken();
            arr = str.toCharArray();
            n = Integer.parseInt(st.nextToken());

            max = 0;

            if(arr.length < n) {	// swap 횟수가 자릿수보다 클 때
                n = arr.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }

            dfs(0, 0);

            System.out.println("#" + test_case + " " + max);
        }
    }
}