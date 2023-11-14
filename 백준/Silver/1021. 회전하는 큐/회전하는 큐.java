import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, cnt;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> dq = new LinkedList<>();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            int num = dq.indexOf(arr[i]);
            int half;

            if (dq.size() % 2 == 0) {
                half = dq.size() / 2 - 1;
            } else {
                half = dq.size() / 2;
            }

            if (num <= half) {
                for (int j = 0; j < num; j++) {
                    int tmp = dq.poll();
                    dq.add(tmp);
                    cnt++;
                }
            } else {
                for (int j = 0; j < dq.size() - num; j++) {
                    int tmp = dq.pollLast();
                    dq.addFirst(tmp);
                    cnt++;
                }
            }

            dq.poll();
        }

        System.out.println(cnt);
    }
}