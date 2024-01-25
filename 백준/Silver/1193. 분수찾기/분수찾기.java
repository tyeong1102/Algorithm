import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int x, sum, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());

        cnt = 1;
        sum = 0;
        while (true) {
            if (x <= sum + cnt) {
                if (cnt % 2 == 1) {
                    System.out.println((cnt - (x - sum - 1)) + "/" + (x - sum));
                    break;
                } else {
                    System.out.println((x - sum) + "/" + (cnt - (x - sum - 1)));
                    break;
                }
            } else {
                sum += cnt;
                cnt++;
            }
        }
    }
}