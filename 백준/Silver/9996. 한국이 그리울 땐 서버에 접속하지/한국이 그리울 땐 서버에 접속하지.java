import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static String pattern;
    public static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        pattern = br.readLine();
        arr = pattern.split("\\*");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.length() >= arr[0].length() + arr[1].length() &&
                    str.startsWith(arr[0]) &&
                    str.endsWith(arr[1])) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);
    }
}