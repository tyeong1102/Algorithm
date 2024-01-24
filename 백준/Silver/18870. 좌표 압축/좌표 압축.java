import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] arr;
    public static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        tmp = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = tmp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tmp);

        int rank = 0;
        for (int v : tmp) {
            if (!map.containsKey(v)) {
                map.put(v, rank);
                rank++;
            }
        }

        for (int key : arr) {
            int ranking = map.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}