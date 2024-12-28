import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            int tmp = num % 42;

            if (!list.contains(tmp)) {
                list.add(tmp);
            }
        }

        System.out.println(list.size());
    }
}