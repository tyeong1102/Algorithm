import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        long num = 0;
        for (long l : map.keySet()) {
            if (map.get(l) > max) {
                max = map.get(l);
                num = l;
            } else if (map.get(l) == max) {
                num = Math.min(l, num);
            }
        }

        System.out.println(num);
    }
}