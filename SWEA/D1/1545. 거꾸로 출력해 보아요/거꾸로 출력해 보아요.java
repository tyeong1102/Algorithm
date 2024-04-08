import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int n;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 0; i--) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}