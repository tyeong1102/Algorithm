import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b, c, s, e, ret;
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
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            for (int j = s; j < e; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ret += a;
            } else if (arr[i] == 2) {
                ret += (b * 2);
            } else if (arr[i] == 3) {
                ret += (c * 3);
            }
        }

        System.out.println(ret);

    }
}