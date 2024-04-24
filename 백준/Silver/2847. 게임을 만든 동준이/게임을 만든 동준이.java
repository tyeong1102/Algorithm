import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        int max = list.get(list.size() - 1);

        for (int i = list.size() - 2; i >= 0; i--) {
            int tmp = list.get(i) - max;

            if (tmp >= 0) {
                ret += tmp + 1;
                max = list.get(i) - tmp - 1;
            } else {
                max = list.get(i);
            }
        }

        System.out.println(ret);
    }
}