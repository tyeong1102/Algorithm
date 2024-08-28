import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int ret;
    public static boolean flag;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        char c = str.charAt(0);
        flag = true;

        for(int i = 1; i < str.length(); i++) {
            if(c != str.charAt(i) && flag) {
                ret++;
                flag = false;
            }

            if(c == str.charAt(i)) {
                flag = true;
            }
        }

        System.out.println(ret);
    }
}