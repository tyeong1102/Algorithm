import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();
            for (int i = 1; i <= str.length(); i++) {
                String a = str.substring(0, i);
                String b = str.substring(i, i + i);

                if (a.equals(b)) {
                    System.out.println("#" + test_case + " " + a.length());
                    break;
                }
            }


        }
    }
}