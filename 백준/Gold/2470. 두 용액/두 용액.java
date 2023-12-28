import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n, s, e, min;
    public static int[] arr;
    public static int[] ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        ret = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        s = 0;
        e = n - 1;
        min = Integer.MAX_VALUE;

        while(s < e) {
            int sum = arr[s] + arr[e];
            int num = Math.abs(sum);
            if (num < min) {
                min = num;
                ret[0] = arr[s];
                ret[1] = arr[e];
            }
            if (sum > 0) {
                e--;
            } else {
                s++;
            }
        }

        System.out.println(ret[0] + " " + ret[1]);
    }
}