import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int n, cnt;

    private static void hanoi(int n, int start, int tmp, int to) {
        if(n == 1){
            sb.append(start + " "+ to+'\n');
            return;
        }

        hanoi(n-1, start, to, tmp);
        sb.append(start + " " + to + "\n");
        hanoi(n-1, tmp, start, to);
    }


    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (n <= 20) {
            sb.append((int) Math.pow(2, n) - 1).append('\n');
            hanoi(n, 1, 2, 3);
        } else {
            BigInteger b = new BigInteger("1");

            for (int i = 0; i < n; i++) {
                b = b.multiply(new BigInteger("2"));
            }

            b = b.subtract(new BigInteger("1"));
            sb.append(b).append('\n');
        }
        System.out.println(sb);
    }
}