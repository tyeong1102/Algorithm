import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t;
    public static int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr = new int[4];

            for(int i = 0; i < 4; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int ret = 0;
            if(arr[0] == arr[2]) {
                ret = arr[3] - arr[1] + 1;
            } else {
                for(int i = arr[0]; i < arr[2]; i++) {
                    ret += date[i - 1];
                }

                ret -= arr[1];
                ret += arr[3] + 1;
            }

            System.out.println("#" + test_case + " " + ret);
        }
    }
}