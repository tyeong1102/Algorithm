import java.util.Scanner;

class Solution {
    public static int t, n, m;

    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * pow(x, y - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++) {
            t = sc.nextInt();
            n = sc.nextInt();
            m = sc.nextInt();

            System.out.println("#" + t + " " + pow(n, m));
        }
    }
}