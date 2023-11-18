import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, p, q, r, s, w;
    public static boolean[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            int A = p * w;
            int B = 0;
            if(w >= r) {
                B = (w - r) * s + q;
            } else {
                B = q;
            }


            int ret = Math.min(A,B);

            System.out.println("#" + test_case + " " + ret);

        }
    }
}