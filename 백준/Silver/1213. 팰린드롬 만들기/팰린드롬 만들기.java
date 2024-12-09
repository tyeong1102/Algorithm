import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int odd;
    public static String ret;
    public static int[] arr = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odd++;
            }
        }

        if (odd > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                }
            }

            ret = sb.toString();

            String tmp = sb.reverse().toString();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    ret += (char) (i + 'A');
                    break;
                }
            }

            ret += tmp;

            System.out.println(ret);
        }
    }
}