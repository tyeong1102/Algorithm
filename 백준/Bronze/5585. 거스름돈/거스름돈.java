import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, change, cnt;
    public static int[] arr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        change = 1000 - n;
        cnt =0;

        for(int i=0; i<6; i++){
            if (change / arr[i] > 0) {
                cnt += change / arr[i];
                change = change % arr[i];
            }
        }

        System.out.println(cnt);
    }
}