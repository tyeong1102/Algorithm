import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long s, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = Long.parseLong(br.readLine());
        long sum = 0;
        long num = 1;

        while (sum <= s) {
            sum += num;
            num++;
            ret++;
        }

        System.out.println(ret - 1);
    }
}