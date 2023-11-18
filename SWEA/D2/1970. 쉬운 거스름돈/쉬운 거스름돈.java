import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;
    public static int[] cost = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    public static int[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());
            arr = new int[cost.length];

            for(int i = 0; i < cost.length; i++) {
                arr[i] = n / cost[i];
                n %= cost[i];
            }

            System.out.println("#" + test_case);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}