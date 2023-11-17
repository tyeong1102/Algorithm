import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int n, cnt;
    public static int[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int test_case = 1; test_case <= 10; test_case++) {
            arr = new int[8][8];
            n = Integer.parseInt(br.readLine());
            cnt = 0;

            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - n + 1; j++) {
                    boolean flag = true;
                    for (int k = 0; k < n / 2; k++) {
                        if (arr[i][j + k] != arr[i][j + n - k - 1]) {
                            flag = false;
                        }
                    }
                    if(flag) cnt++;
                }
            }

            for (int i = 0; i < arr.length - n + 1; i++) {
                for (int j = 0; j < arr.length; j++) {
                    boolean flag = true;
                    for (int k = 0; k < n / 2; k++) {
                        if (arr[i + k][j] != arr[i + n - k - 1][j]) {
                            flag = false;
                        }
                    }
                    if(flag) cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }


    }
}