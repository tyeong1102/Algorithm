import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int sum, ret, di, dj;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                ret = sum - arr[i] - arr[j];

                if (ret == 100) {
                    arr[i] = arr[j] = 0;

                    Arrays.sort(arr);

                    for (int k = 2; k < 9; k++) {
                        sb.append(arr[k]).append("\n");
                    }

                    System.out.println(sb);
                    return;
                }
            }
        }


    }
}