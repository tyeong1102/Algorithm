import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, ret;
    public static int[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {

            arr = new int[10][10];

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean flag = true;

            for (int i = 0; i < 9; i++) {
                int[] list = new int[10];
                for (int j = 0; j < 9; j++) {
                    list[arr[i][j]]++;
                }

                for (int j = 1; j <= 9; j++) {
                    if (list[j] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] list = new int[10];
                for (int j = 0; j < 9; j++) {
                    list[arr[j][i]]++;
                }

                for (int j = 1; j <= 9; j++) {
                    if (list[j] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int[] list = new int[10];
                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            list[arr[x][y]]++;
                        }
                    }
                    for (int k = 1; k <= 9; k++) {
                        if (list[k] == 0) {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if (flag) {
                ret = 1;
            } else {
                ret = 0;
            }

            sb.append('#').append(test_case).append(' ').append(ret).append('\n');
        }

        System.out.println(sb);
    }
}