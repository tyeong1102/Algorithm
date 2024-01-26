import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static int n;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while(cnt != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}