import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());

            int a = 0; // 2
            int b = 0; // 3
            int c = 0; // 5
            int d = 0; // 7
            int e = 0; // 11

            while (n > 1) {
                if (n % 2 == 0) {
                    a++;
                    n /= 2;
                } else if (n % 3 == 0) {
                    b++;
                    n /= 3;
                } else if (n % 5 == 0) {
                    c++;
                    n /= 5;
                } else if (n % 7 == 0) {
                    d++;
                    n /= 7;
                } else if (n % 11 == 0) {
                    e++;
                    n /= 11;
                }
            }

            sb.append("#").append(test_case).append(" ");
            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(e).append("\n");
        }

        System.out.println(sb);
    }
}