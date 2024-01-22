import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int t, s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        if (s == 1 || t <= 11 || t > 16) {
            System.out.println(280);
        } else {
            System.out.println(320);
        }
    }
}