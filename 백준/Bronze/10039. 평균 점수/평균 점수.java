import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int score, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            score = Integer.parseInt(br.readLine());

            if (score < 40) {
                sum += 40;
            } else {
                sum += score;
            }
        }

        System.out.println(sum / 5);
    }
}