import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static String[] arr;

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new String[n + 1];

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (isInteger(str)) {
                System.out.println(arr[Integer.parseInt(str)]);
            } else {
                System.out.println(map.get(str));
            }
        }
    }
}