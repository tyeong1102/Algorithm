import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (n < 100) {
            cnt += n;
        } else {
            cnt += 99;
            for (int i = 100; i <= n; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}