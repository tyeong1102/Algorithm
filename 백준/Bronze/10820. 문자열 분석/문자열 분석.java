import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;
    public static int n, upper, lower, num, blank;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((str = br.readLine()) != null) {
            upper = 0;
            lower = 0;
            num = 0;
            blank = 0;

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    blank++;
                } else if (c >= 'a' && c <= 'z') {
                    lower++;
                } else if (c >= 'A' && c <= 'Z') {
                    upper++;
                } else if (c >= '0' && c <= '9') {
                    num++;
                }
            }

            System.out.println(lower + " " + upper + " " + num + " " + blank);
        }
    }
}