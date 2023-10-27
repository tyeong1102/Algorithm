import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int cnt = 0;
        int a = 0;
        int b = n - 1;

        while(a < b) {
            if(arr[a] + arr[b] < x) a++;
            if (arr[a] + arr[b] > x) b--;
            if (arr[a] + arr[b] == x){
                cnt++;
                a++;
                b--;
            }
        }

        System.out.println(cnt);
    }
}