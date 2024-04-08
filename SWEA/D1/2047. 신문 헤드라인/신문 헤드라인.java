import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static String str;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();

        System.out.println(str.toUpperCase());
    }
}