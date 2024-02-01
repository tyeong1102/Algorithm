import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}