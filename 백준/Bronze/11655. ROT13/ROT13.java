import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 65 && c <= 90) {
                if (c + 13 > 90) {
                    c = (char) (c + 13 - 26);
                } else {
                    c += 13;
                }

                sb.append(c);

            } else if (c >= 97 && c <= 122) {
                if (c + 13 > 122) {
                    c = (char) (c + 13 - 26);
                } else {
                    c += 13;
                }

                sb.append(c);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}