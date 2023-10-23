import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            double avg = 0;
            double cnt = 0;
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            avg = sum / n;

            for (int j = 0; j < n; j++) {
                if(arr[j] > avg) cnt++;
            }

            System.out.printf("%.3f%%\n", (cnt / n)*100);
        }

    }
}