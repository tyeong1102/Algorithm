import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());

            map.put(num, i);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        sb.append(list.get(list.size() - 1)).append("\n");
        sb.append(map.get(list.get(list.size() - 1)));

        System.out.println(sb);
    }
}