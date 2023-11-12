import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, num;
    public static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringBuilder sb = new StringBuilder();
            num = Integer.parseInt(br.readLine());
            arr = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                arr[score]++;
            }

            int ret = 0;
            int max = 0;
            for (int i = 100; i > 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                    ret = i;
                }
            }

            sb.append('#').append(num).append(' ').append(ret);

            System.out.println(sb);
        }
    }
}