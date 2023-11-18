import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
    public static int cnt;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int test = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            int cnt = 1;
            while (true) {
                int tmp = q.poll() - cnt;

                if(tmp <= 0) {
                    q.add(0);
                    break;
                } else {
                    q.add(tmp);
                }

                cnt = (cnt % 5) + 1;
            }

            System.out.print("#" + test_case + " ");
            for(int i = 0; i < 8; i++) {
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}