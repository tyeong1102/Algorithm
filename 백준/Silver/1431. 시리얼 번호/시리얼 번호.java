import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static int n;
    public static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int sum1 = 0;
                    int sum2 = 0;

                    for (int i = 0; i < o1.length(); i++) {
                        if (Character.isDigit(o1.charAt(i))) {
                            sum1 += o1.charAt(i) - '0';
                        }
                    }

                    for (int i = 0; i < o2.length(); i++) {
                        if (Character.isDigit(o2.charAt(i))) {
                            sum2 += o2.charAt(i) - '0';
                        }
                    }

                    if (sum1 == sum2) {
                        return o1.compareTo(o2);
                    } else {
                        return sum1 - sum2;
                    }
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}