import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            map1.put(str, i);
            map2.put(i, str);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                sb.append(map1.get(str)).append("\n");
            } else {
                sb.append(map2.get(Integer.parseInt(str))).append("\n");
            }
        }

        System.out.println(sb);
    }
}