import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        String[] sub = br.readLine().split("-");

        for (int i = 0; i < sub.length; i++) {
            int tmp = 0;

            String[] add = sub[i].split("\\+");

            for (int j = 0; j < add.length; j++) {
                tmp += Integer.parseInt(add[j]);
            }

            if (min == Integer.MAX_VALUE) {
                min = tmp;
            } else {
                min -= tmp;
            }
        }

        System.out.println(min);
    }
}