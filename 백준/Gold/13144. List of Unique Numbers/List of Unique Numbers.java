import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static long ret;
    public static int[] arr, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<>();

        int s = 0;

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                for (int j = s; j < i; j++) {
                    ret += i - j;
                    s++;

                    if (arr[j] == arr[i]) {
                        break;
                    }
                    set.remove(arr[j]);
                }
            } else {
                set.add(arr[i]);
            }
        }

        for (int i = s; i < n; i++) {
            ret += n - i;
        }

        System.out.println(ret);
    }
}