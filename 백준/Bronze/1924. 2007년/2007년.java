import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int x, y;
    public static String[] day;
    public static int[] month;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        day = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int n = 0;
        for (int i = 0; i < x; i++) {
            n += month[i];
        }
        n += y - 1;

        System.out.print(day[n % 7]);
    }
}