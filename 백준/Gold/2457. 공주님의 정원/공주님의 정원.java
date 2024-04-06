import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n;
    public static int sMon, eMon, sDay, eDay;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            sMon = Integer.parseInt(st.nextToken());
            sDay = Integer.parseInt(st.nextToken());
            eMon = Integer.parseInt(st.nextToken());
            eDay = Integer.parseInt(st.nextToken());

            list.add(new int[]{sMon * 100 + sDay, eMon * 100 + eDay});
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }

                return o1[0] - o2[0];
            }
        });

        int s = 301;
        int idx = 0;
        int max = Integer.MIN_VALUE;
        int ret = 0;

        while (s < 1201) {
            boolean check = false;
            for (int i = idx; i < n; i++) {
                if (list.get(i)[0] > s) {
                    break;
                }

                if (list.get(i)[0] <= s && max < list.get(i)[1]) {
                    max = list.get(i)[1];
                    idx = i + 1;
                    check = true;
                }
            }

            if (check) {
                s = max;
                ret++;
            } else {
                break;
            }
        }

        if (max < 1201) {
            System.out.println(0);
        } else {
            System.out.println(ret);
        }
    }
}