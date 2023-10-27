import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int ret = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c && a == c) {
            ret = 10000 + a * 1000;
        } else if (a == b || a == c) {
            ret = 1000 + a * 100;
        } else if (b == c) {
            ret = 1000 + b * 100;
        } else {
            ret = Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(ret);
    }
}