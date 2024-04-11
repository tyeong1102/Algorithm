import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = 1;

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 1) {
                if (b == 2) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            } else if (a == 2) {
                if (b == 3) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            } else {
                if (b == 1) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            }
        }
    }
}