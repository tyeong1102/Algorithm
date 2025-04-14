import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static String a, b, c, d;
    public static long sum1, sum2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = st.nextToken();
        b = st.nextToken();
        c = st.nextToken();
        d = st.nextToken();

        String s1 = a + b;
        String s2 = c + d;

        sum1 = Long.parseLong(s1);
        sum2 = Long.parseLong(s2);

        System.out.println(sum1 + sum2);
    }
}