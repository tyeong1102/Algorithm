import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, change, cnt, num;
    public static int[] arr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        change = 1000 - n;
        cnt = 0;
        num = 0;

        while (change > 0) {
            if (arr[num] > change) {
                num++;
            } else {
                int calc = change / arr[num];
                change -= (arr[num] * calc);
                cnt += calc;
            }
        }

        System.out.println(cnt);
    }
}