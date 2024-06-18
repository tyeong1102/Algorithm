import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int e, s, m, E, S, M, year;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        e = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        E = 0;
        S = 0;
        M = 0;
        year = 0;

        while (true) {
            year++;
            E++;
            S++;
            M++;
            if (E == 16) {
                E = 1;
            }
            if (S == 29) {
                S = 1;
            }
            if (M == 20) {
                M = 1;
            }
            if (e == E && m == M && S == s) {
                break;
            }
        }

        System.out.print(year);
    }
}