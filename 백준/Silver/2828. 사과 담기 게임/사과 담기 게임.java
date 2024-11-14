import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, k, s, e, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());

        s = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine()) - 1;
            e = s + m - 1;

            if(num >= s && num <= e) {
                continue;
            } else {
                if (e < num) {
                    ret += num - e;
                    s += num - e;
                    e += num - e;
                } else {
                    ret += s - num;
                    s -= s - num;
                }
            }
        }

        System.out.println(ret);
    }
}