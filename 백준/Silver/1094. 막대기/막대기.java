import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int x, sum, ret;
    public static int[] arr = {64, 32, 16, 8, 4, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
        sum = 0;
        ret = 1;

        if (x == 64) {
            System.out.println(ret);
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (sum + arr[i] > x) {
                continue;
            } else if (sum + arr[i] < x) {
                sum += arr[i];
                ret++;
                if (sum == x) {
                    System.out.println(ret);
                    return;
                }
            } else {
                System.out.println(ret);
            }
        }


    }
}