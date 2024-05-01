import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int ret, n, num;
    public static char[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new char[8][8];
            ret = 0;

            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            num = n / 2;

            // 행 검사
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - n; j++) {
                    boolean flag = true;
                    for (int k = 0; k <= num; k++) {
                        if (arr[i][j + k] != arr[i][j + n - k - 1]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        ret++;
                    }
                }
            }
            // 열 검사
            for (int i = 0; i <= 8 - n; i++) {
                for (int j = 0; j < 8; j++) {
                    boolean flag = true;
                    for (int k = 0; k <= num; k++) {
                        if (arr[i + k][j] != arr[i + n - k - 1][j]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        ret++;
                    }
                }
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}