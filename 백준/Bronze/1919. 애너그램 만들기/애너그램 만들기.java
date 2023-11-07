import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int n = str1.charAt(i) - 97;
            arr1[n]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int m = str2.charAt(i) - 97;
            arr2[m]++;
        }

        int ret = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                ret += Math.abs(arr1[i] - arr2[i]);
            }
        }

        System.out.println(ret);

    }
}