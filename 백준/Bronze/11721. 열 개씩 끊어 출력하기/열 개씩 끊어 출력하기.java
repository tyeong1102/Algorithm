import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();

        int n = str.length() / 10;
        int idx = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(idx, idx + 10)).append("\n");
            idx += 10;
        }

        n = str.length() % 10;

        sb.append(str.substring(str.length() - n));

        System.out.println(sb);
    }
}