import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t;
    public static int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            String str = br.readLine();
            String year = str.substring(0, 4);
            String month = str.substring(4, 6) ;
            String day = str.substring(6, 8) ;

            if (Integer.parseInt(month) > 0 && Integer.parseInt(month) < 13 && Integer.parseInt(day) <= arr[Integer.parseInt(month)]) {
                System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
            } else {
                System.out.println("#" + test_case + " " + -1);
            }

        }
    }
}