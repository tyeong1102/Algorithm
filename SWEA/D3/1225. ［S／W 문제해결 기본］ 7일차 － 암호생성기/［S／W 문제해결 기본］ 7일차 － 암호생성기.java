import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
    public static int t, num;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            t = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
            }

            boolean flag = true;

            while (true) {
                for (int i = 1; i <= 5; i++) {
                    num = q.poll() - i;

                    if (num <= 0) {
                        q.add(0);
                        flag = false;
                        break;
                    } else {
                        q.add(num);
                    }
                }

                if (!flag) {
                    break;
                }
            }

            sb.append("#").append(test_case).append(" ");

            for (int num : q) {
                sb.append(num).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
