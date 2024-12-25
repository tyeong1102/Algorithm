import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] input = br.readLine().split(",");

            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);

            sb.append(a + b).append("\n");
        }

        System.out.println(sb);
    }
}