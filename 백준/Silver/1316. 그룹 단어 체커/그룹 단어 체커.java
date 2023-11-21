import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, ret;
    public static boolean[] arr;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean check() throws IOException {
        arr = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!arr[now - 97]) {
                    arr[now - 97] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        ret = 0;
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (check()) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}