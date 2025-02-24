import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    public static int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += date[i];
        }

        sum += m;

        int tmp = sum % 7;

        System.out.println(day[tmp]);
    }
}