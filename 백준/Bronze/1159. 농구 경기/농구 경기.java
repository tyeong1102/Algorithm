import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[26];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            arr[c - 'a']++;
        }

        boolean flag = false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5) {
                sb.append((char)(i + 'a'));
                flag = true;
            }
        }

        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("PREDAJA");
        }
    }
}