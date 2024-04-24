import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int zeroCnt, oneCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char tmp = str.charAt(0);

        if (tmp == '0') {
            zeroCnt++;
        } else {
            oneCnt++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (tmp != str.charAt(i)) {
                if (str.charAt(i) == '0') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
                tmp = str.charAt(i);
            }
        }

        if (zeroCnt > oneCnt) {
            System.out.println(oneCnt);
        } else {
            System.out.println(zeroCnt);
        }
    }
}