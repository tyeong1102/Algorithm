import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static int n, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            ret = 0;
            arr = new int[20];

            int a = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j =0; j < 20; j++){
                for (int k = 0; k < j; k++) {
                    if (arr[k] > arr[j]) {
                        ret++;
                    }
                }
            }

            sb.append(a).append(" ").append(ret).append("\n");
        }



        System.out.println(sb);

    }

}