import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr = new int[26];

            String str1 = st.nextToken();
            String str2 = st.nextToken();

            for (int i = 0; i < str1.length(); i++) {
                int a = str1.charAt(i) - 97;
                arr[a]++;
            }

            for (int i = 0; i < str2.length(); i++) {
                int a = str2.charAt(i) - 97;
                arr[a]--;
            }

            boolean flag = true;
            for (int a : arr) {
                if (a != 0) {
                    flag = false;
                }
            }

            if (flag == true) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }

        }
    }
}