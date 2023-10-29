import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        if(b > a) {
            for (long i = a + 1; i < b; i++) {
                sb.append(i).append(" ");
            }

            System.out.println(b - a - 1);
            System.out.println(sb);
        } else if (a > b) {
            for (long i = b + 1; i < a; i++) {
                sb.append(i).append(" ");
            }

            System.out.println(a - b - 1);
            System.out.println(sb);
        }
        if (a == b) {
            System.out.println(0);
        }

    }
}