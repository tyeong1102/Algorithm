import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, team, goal1, goal2, time1, time2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        int endTime = 48 * 60;
        int lastGoalTime = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            team = Integer.parseInt(st.nextToken());

            String[] arr = st.nextToken().split(":");

            int timeToSec = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

            if (goal1 > goal2) {
                time1 += timeToSec - lastGoalTime;
            } else if (goal1 < goal2) {
                time2 += timeToSec - lastGoalTime;
            }

            if (team == 1) {
                goal1++;
            } else {
                goal2++;
            }

            lastGoalTime = timeToSec;
        }

        if (goal1 > goal2) {
            time1 += endTime - lastGoalTime;
        } else if (goal1 < goal2) {
            time2 += endTime - lastGoalTime;
        }

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%02d", time1 / 60)).append(":").append(String.format("%02d", time1 % 60)).append("\n");
        sb.append(String.format("%02d", time2 / 60)).append(":").append(String.format("%02d", time2 % 60));

        System.out.println(sb);

    }
}