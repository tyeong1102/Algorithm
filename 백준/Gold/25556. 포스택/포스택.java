import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer>[] s = new Stack[4];

        for (int i = 0; i < 4; i++) {
            s[i] = new Stack<>();
            s[i].push(0);
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < 4; j++) {
                if (s[j].peek() < arr[i]) {
                    s[j].push(arr[i]);
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}