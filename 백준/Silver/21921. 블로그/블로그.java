import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, x, term;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        term = 1;

        long sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        long max = sum;
        for (int i = x; i < n; i++) {
            sum += arr[i] - arr[i - x];
            if (max == sum) {
                term++;
            } else if(max < sum) {
                max = sum;
                term = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        if (max == 0) {
            System.out.println("SAD");
            return;
        }

        sb.append(max).append("\n").append(term);
        System.out.println(sb);
    }
}