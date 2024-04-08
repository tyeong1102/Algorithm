import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>();
        List<Integer> min = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num <= 0) {
                min.add(num);
            } else {
                plus.add(num);
            }
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(min);

        int i = 0;

        while (i < plus.size()) {
            if (i + 1 < plus.size() && plus.get(i) != 1 && plus.get(i + 1) != 1) {
                ret += plus.get(i++) * plus.get(i++);
            } else {
                ret += plus.get(i++);
            }
        }

        i = 0;

        while (i < min.size()) {
            if (i + 1 < min.size() && min.get(i) != 1 && min.get(i + 1) != 1) {
                ret += min.get(i++) * min.get(i++);
            } else {
                ret += min.get(i++);
            }
        }

        System.out.println(ret);

    }
}