import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, ret, cnt;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            str = br.readLine();
            boolean flag = false;
            ret = 0;
            cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i);
                if (c == 'O') {
                    if (flag) {
                        cnt++;
                        ret += cnt;
                    } else {
                        flag = true;
                        cnt++;
                        ret += cnt;
                    }
                } else {
                    flag = false;
                    cnt = 0;
                }
            }

            sb.append(ret).append("\n");
        }

        System.out.println(sb);
    }
}