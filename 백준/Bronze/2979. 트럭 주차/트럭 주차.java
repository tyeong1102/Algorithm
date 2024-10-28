import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b, c, arrive, leave, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            arrive = Integer.parseInt(st.nextToken());
            leave = Integer.parseInt(st.nextToken());

            for (int j = arrive; j < leave; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ret += a;
            } else if (arr[i] == 2) {
                ret += (b * arr[i]);
            } else if (arr[i] == 3) {
                ret += (c * arr[i]);
            }
        }

        System.out.println(ret);
    }
}