import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[] arr = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[str.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                flag = true;
                sb.append((char) (i + 'a'));
            }
        }

        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("PREDAJA");
        }
    }
}