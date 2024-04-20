import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        n /= 100;
        n *= 100;
        int f = Integer.parseInt(br.readLine());
        int ret = 0;

        while (n % f != 0) {
            n++;
            ret++;
        }
        if (ret < 10) {
            System.out.print("0" + ret);
        } else {
            System.out.print(ret);
        }
    }
}