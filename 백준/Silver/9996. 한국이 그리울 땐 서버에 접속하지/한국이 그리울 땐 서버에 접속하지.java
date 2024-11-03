import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        str = br.readLine();

        String[] arr = str.split("\\*");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if(arr[0].length() + arr[1].length() > s.length()) {
                sb.append("NE").append("\n");
                continue;
            }

            String front = s.substring(0, arr[0].length());
            String back = s.substring(s.length() - arr[1].length(), s.length());

            if (front.equals(arr[0]) && back.equals(arr[1])) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);

    }
}