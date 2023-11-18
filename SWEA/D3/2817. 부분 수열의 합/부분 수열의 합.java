import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, k, ret;
    public static int[] arr;
    public static void go(int idx, int sum) {
        if(idx == n) {
            if(sum == k) {
                ret++;
            }
            return;
        }

        go(idx+1, sum + arr[idx]);
        go(idx+1, sum);
    }

    public static void main(String args[]) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        t= Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t;  test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i <n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            ret = 0;
            go(0,0);

            System.out.println("#" + test_case + " " + ret);
        }
    }
}