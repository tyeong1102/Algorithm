import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int sum, fake1, fake2;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 9; i++) {
            boolean flag = false;
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = arr[i];
                    fake2 = arr[j];
                    flag = true;
                    break;
                }
            }

            if (flag) break;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            if (arr[i] == fake1 || arr[i] == fake2) continue;

            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}