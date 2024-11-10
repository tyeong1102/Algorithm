import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, t, p, tRet, pRet1, pRet2;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[6];

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % t == 0) {
                tRet += arr[i] / t;
            } else {
                tRet += (arr[i] / t) + 1;
            }
        }

        pRet1 = n / p;
        pRet2 = n % p;

        StringBuilder sb = new StringBuilder();

        sb.append(tRet).append("\n");
        sb.append(pRet1).append(" ").append(pRet2).append("\n");

        System.out.println(sb);
    }
}