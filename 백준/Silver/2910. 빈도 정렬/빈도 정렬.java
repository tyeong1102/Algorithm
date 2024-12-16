import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(!list1.contains(num)) {
                list1.add(num);
            }
        }

        List<Integer> list2 = new ArrayList<>(map.keySet());

        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) == map.get(o2)) {
                    return list1.indexOf(o1) - list1.indexOf(o2);
                }
                return map.get(o2) - map.get(o1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int num : list2) {
            for (int i = 0; i < map.get(num); i++) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb);


    }
}