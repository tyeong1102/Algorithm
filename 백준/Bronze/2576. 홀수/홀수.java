import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 1) {
                list.add(n);
                sum += n;
            }
        }

        Collections.sort(list);

        if (list.isEmpty()) {
            sb.append(-1);
        } else {
            sb.append(sum).append('\n').append(list.get(0));
        }

        System.out.println(sb);
    }
}