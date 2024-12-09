import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static int t, n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            ret = 1;

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                String[] arr = str.split(" ");

                map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            }

            for (String str : map.keySet()) {
                ret *= (map.get(str) + 1);
            }

            sb.append(ret - 1).append("\n");
        }

        System.out.println(sb);
    }
}