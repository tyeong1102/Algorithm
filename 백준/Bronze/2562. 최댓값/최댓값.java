import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++) {
           arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);
    }
}