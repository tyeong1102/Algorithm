import java.util.Arrays;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int[] arr = new int[100];

            int n = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            int ret = 0;

            for(int i = 0; i < n; i++) {
                Arrays.sort(arr);
                if(arr[0] == arr[99]) {
                    ret = 0;
                    break;
                }
                if(arr[0] + 1 == arr[99]) {
                    ret = 1;
                    break;
                }

                arr[0]++;
                arr[99]--;
            }

            Arrays.sort(arr);
            ret = arr[99] - arr[0];


            System.out.println("#" + test_case + " " + ret);
        }
    }
}