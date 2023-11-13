import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int t;
    public static String str;
    public static char[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringBuilder sb = new StringBuilder();

            str = br.readLine();
            arr = str.toCharArray();

            int max = Integer.parseInt(str);
            int min = max;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                    int num = Integer.parseInt(String.valueOf(arr));

                    if (arr[0] - '0' != 0 && num < min) {
                        min = num;
                    }

                    if (arr[0] - '0' != 0 && num > max) {
                        max = num;
                    }

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            sb.append('#').append(test_case).append(' ').append(min).append(' ').append(max);

            System.out.println(sb);
        }
    }
}