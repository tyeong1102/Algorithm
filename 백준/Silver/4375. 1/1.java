import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            n = Integer.parseInt(input);
            long num = 1;
            int cnt = 1;

            while (num % n != 0) {
                num = (num * 10 + 1) % n;
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}