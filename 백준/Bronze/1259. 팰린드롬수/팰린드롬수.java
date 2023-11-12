import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            str = br.readLine();
            boolean flag = true;

            if (str.equals("0")) {
                break;
            }

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(str.length() - i - 1) != str.charAt(i)) {
                    flag = false;
                }
            }

            if (flag == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}