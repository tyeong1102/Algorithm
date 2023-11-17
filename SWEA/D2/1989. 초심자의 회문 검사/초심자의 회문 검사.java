import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

class Solution {
    public static int t;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();
            boolean flag = true;

            int len = str.length();

            if (len % 2 == 1) {
                for (int i = 0; i < len / 2; i++) {
                    if (str.charAt(i) != str.charAt(len - i - 1)) {
                        flag = false;
                    }
                }
            } else {
                for (int i = 0; i < len / 2 - 1; i++) {
                    if (str.charAt(i) != str.charAt(len - i - 1)) {
                        flag = false;
                    }
                }
            }

            int ret = 0;
            if (flag) {
                ret = 1;
            } else {
                ret = 0;
            }
            System.out.println("#" + test_case + " " + ret);
        }
    }
}