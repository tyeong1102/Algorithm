import java.util.Scanner;

class Solution
{
    static int sum1, sum2, sum3, sum4;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int[][] arr = new int[100][100];
            int T = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int i = 0; i < 100; i++) {
                sum1 = 0;
                for (int j = 0; j < 100; j++) {
                    sum1 += arr[i][j];
                }

                max = Math.max(max, sum1);
            }

            for (int i = 0; i < 100; i++) {
                sum2 = 0;
                for (int j = 0; j < 100; j++) {
                    sum2 += arr[j][i];
                }

                max = Math.max(max, sum2);
            }

            for (int i = 0; i < 100; i++) {
                sum3 = 0;
                sum3 += arr[i][i];
            }

            int a = 0;
            for (int i = 99; i >= 0; i--) {
                sum4 = 0;
                sum4+= arr[a][i];
                a++;
            }

            max = Math.max(max, sum3);
            max = Math.max(max, sum4);

            System.out.println("#" + T + " " + max);

        }
    }
}