import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = br.readLine();
        b = br.readLine();
        c = br.readLine();

        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int numC = Integer.parseInt(c);

        sb.append(numA + numB - numC).append("\n");

        String str = a + b;
        int tmp = Integer.parseInt(str);

        sb.append(tmp - numC);

        System.out.println(sb);
    }
}