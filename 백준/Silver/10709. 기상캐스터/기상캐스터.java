import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int h, w;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        while (h-- > 0) {
            String str = br.readLine();
            boolean flag = false;
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'c') {
                    flag = true;
                    cnt = 0;
                    sb.append(cnt).append(" ");
                } else if (str.charAt(i) == '.' && !flag) {
                    sb.append(-1).append(" ");
                } else if(str.charAt(i) == '.' && flag) {
                    cnt++;
                    sb.append(cnt).append(" ");
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}