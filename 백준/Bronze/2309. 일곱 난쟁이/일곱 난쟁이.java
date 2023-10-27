import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int fake1 = 0, fake2 = 0;
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if(i == fake1 || i == fake2) continue;
            System.out.println(arr[i]);
        }
    }
}