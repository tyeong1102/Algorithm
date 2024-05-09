import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, p, q, r, s, w, ret;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            p = Integer.parseInt(st.nextToken()); // a사 리터 당 요금
            q = Integer.parseInt(st.nextToken()); // b사 기본요금
            r = Integer.parseInt(st.nextToken()); // b사 월간 기본 사용량
            s = Integer.parseInt(st.nextToken()); // b사 사용량 초과 시 리터 당 요금
            w = Integer.parseInt(st.nextToken()); // 사용한 양

            int aPay = p * w;
            int bPay = 0;
            if (w <= r) {
                bPay = q;
            } else {
                bPay = (w - r) * s + q;
            }

            if (aPay < bPay) {
                ret = aPay;
            } else {
                ret = bPay;
            }

            sb.append("#").append(test_case).append(" ").append(Math.round(ret)).append("\n");
        }

        System.out.println(sb);
    }
}