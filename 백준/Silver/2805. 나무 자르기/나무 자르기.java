import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, s, e, mid;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 나무의 수
        m = Integer.parseInt(st.nextToken()); // 필요 나무 길이
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(e < arr[i]) {
                e = arr[i];
            }
        }

        while(s < e) {
            mid = (s + e) / 2;
            long sum = 0;
            for(int tree : arr) {
                if(tree - mid > 0) {
                    sum += (tree - mid);
                }
            }

            if(sum < m) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        System.out.println(s - 1);
    }
}