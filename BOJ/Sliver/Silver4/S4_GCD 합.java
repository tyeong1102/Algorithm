import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            long sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < n; j++){
                for(int k = 0; k < j; k++){
                    sum += gcd(arr[j], arr[k]);
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}