import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String group = br.readLine();
            int num = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                list.add(br.readLine());
            }
            map.put(group, list);
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int quiz = Integer.parseInt(br.readLine());

            if (quiz == 0) {
                ArrayList<String> list = map.get(name);
                Collections.sort(list);
                for (String member : list) {
                    sb.append(member).append('\n');
                }
            } else {
                for (String group : map.keySet()) {
                    if (map.get(group).contains(name)) {
                        sb.append(group).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}