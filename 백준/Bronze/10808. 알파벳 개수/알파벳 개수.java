import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 97;
            arr[n]++;
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}