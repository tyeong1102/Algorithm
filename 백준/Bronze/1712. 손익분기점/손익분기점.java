import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken()); // 고정비용
        b = Integer.parseInt(st.nextToken()); // 가변비용
        c = Integer.parseInt(st.nextToken()); // 가격

        if (c <= b) {
            System.out.println("-1");
        } else {
            System.out.println((a / (c - b)) + 1);
        }
    }
}