import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        List<BigInteger> list = new ArrayList<>();

        while (n-- > 0) {
            String str = br.readLine();
            StringBuilder tmp = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 65) {
                    tmp.append(str.charAt(i));
                } else {
                    if (tmp.length() != 0) {
                        BigInteger num = new BigInteger(tmp.toString());
                        list.add(num);
                    }
                    tmp = new StringBuilder();
                }
            }

            if (tmp.length() != 0) {
                BigInteger num = new BigInteger(tmp.toString());
                list.add(num);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (BigInteger num : list) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}