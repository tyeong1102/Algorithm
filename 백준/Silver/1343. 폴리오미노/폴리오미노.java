import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;
    public static boolean flag = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();

        String str1 = str.replaceAll("XXXX", "AAAA");
        String str2 = str1.replaceAll("XX", "BB");

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'X') {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(str2);
        } else {
            System.out.println("-1");
        }
    }
}