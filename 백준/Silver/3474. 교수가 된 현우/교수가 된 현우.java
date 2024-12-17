import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            ret = 0;
            int num = 1;

            while (true) {
                int tmp = (int) Math.pow(5, num);

                if (tmp > n) {
                    break;
                }

                ret += n / tmp;
                num++;
            }

            sb.append(ret).append("\n");
        }

        System.out.println(sb);
    }
}