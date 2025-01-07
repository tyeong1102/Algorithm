import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int hour, min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());

        if (min >= 45) {
            System.out.println(hour + " " + (min - 45));
        } else {
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            min = 60 - (45 - min);

            System.out.println(hour + " " +  min);
        }
    }
}