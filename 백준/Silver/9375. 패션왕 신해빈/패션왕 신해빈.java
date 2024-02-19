import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int t, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();

                String cloth = st.nextToken();

                if (map.containsKey(cloth)) {
                    map.put(cloth, map.get(cloth) + 1);
                } else {
                    map.put(cloth, 1);
                }
            }

            int ret = 1;

            for (int num : map.values()) {
                ret *= (num + 1);
            }

            System.out.println(ret - 1);
        }
    }
}