import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static int t, n, ret;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            ArrayList<Integer> list = new ArrayList<>(map.keySet());

            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (map.get(o1) == map.get(o2)) {
                        return o2 - o1;
                    }
                    return map.get(o2) - map.get(o1);
                }
            });

            ret = list.get(0);

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");

        }

        System.out.println(sb);
    }
}