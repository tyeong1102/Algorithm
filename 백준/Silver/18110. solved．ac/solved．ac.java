import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int n;
    public static double sum;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        int tmp = (int) Math.round(n * 0.15);

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = tmp; i < n - tmp; i++) {
            sum += arr[i];
        }

        int ret = (int) Math.round(sum / (n - (2 * tmp)));

        System.out.println(ret);
    }
}