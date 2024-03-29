import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        int a = Integer.parseInt(sb1.reverse().toString());
        int b = Integer.parseInt(sb2.reverse().toString());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}