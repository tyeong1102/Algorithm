import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String str;
    public static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        arr = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                if (arr[i] + 13 > 90) {
                    arr[i] = (char) (arr[i] + 13 - 26);
                } else {
                    arr[i] = (char) (arr[i] + 13);
                }
            } else if(arr[i] >= 97 && arr[i] <= 122) {
                if (arr[i] + 13 > 122) {
                    arr[i] = (char) (arr[i] + 13 - 26);
                } else {
                    arr[i] = (char) (arr[i] + 13);
                }
            }

            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}