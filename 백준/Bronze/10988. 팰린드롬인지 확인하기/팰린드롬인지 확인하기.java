import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean flag = true;
    public static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        arr = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            if (arr[i] != arr[str.length() - 1 - i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}