import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            ret += str.charAt(i) - '0';
        }

        System.out.println(ret);
    }
}