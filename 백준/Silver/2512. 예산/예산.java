import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, s, e;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        s = 0;
        e = -1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            e = Math.max(e, arr[i]);
        }

        m = Integer.parseInt(br.readLine());

        while (s <= e) {
            int mid = (s + e) / 2;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    sum += mid;
                } else {
                    sum += arr[i];
                }
            }

            if (sum <= m) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        System.out.println(e);
    }
}