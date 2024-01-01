import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, ret;
    public static int[] arr;
    public static int[] arrT;
    public static int[] arrP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arrT = new int[n + 2];
        arrP = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arrT[i] = Integer.parseInt(st.nextToken());
            arrP[i] = Integer.parseInt(st.nextToken());
        }

        arr = new int[n + 2];
        int max = 0;

        for (int i = 1; i <= n + 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            int day = i + arrT[i];

            if (day <= n + 1) {
                arr[day] = Math.max(arr[day], max + arrP[i]);
            }
        }

        System.out.println(max);
    }
}