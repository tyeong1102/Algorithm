import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int cnt = 0;
            int n = sc.nextInt();
            int[][] arr = new int[100][100];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < n; i++) {
                int tmp = 0;
                for(int j = 0; j < n; j++) {
                    if(arr[j][i] == 1) {
                        tmp = 1;
                    } else if(arr[j][i] == 2) {
                        if(tmp == 1){
                            cnt++;
                        }
                        tmp = 2;
                    }
                }
            }

            System.out.println("#" + test_case + " " + cnt);
        }
	}
}