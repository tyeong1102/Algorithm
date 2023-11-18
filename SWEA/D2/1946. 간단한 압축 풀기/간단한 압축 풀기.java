import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n;
    public static char[] arr;
    public static int[] num;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());

            arr = new char[n];
            num = new int[n];

            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                arr[i] = st.nextToken().charAt(0);
                num[i] = Integer.parseInt(st.nextToken());
            }

            System.out.println("#" + test_case);
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < num[i]; j++) {
                    System.out.print(arr[i]);
                    cnt++;
                    if(cnt == 10) {
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}