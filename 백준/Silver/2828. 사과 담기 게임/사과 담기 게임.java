import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, t, s, e, drop, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(br.readLine());

        s = 1;
        e = s + m - 1;

        for (int i = 0; i < t; i++) {
            drop = Integer.parseInt(br.readLine());

            if (drop < s) {
                ret += (s - drop);
                e -= (s - drop);
                s -= (s - drop);
            } else if (drop > e) {
                ret += (drop - e);
                s = s + (drop - e);
                e += (drop - e);

            }
        }

        System.out.println(ret);
    }
}