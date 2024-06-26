import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> s = new Stack<>();

        for(int i = 1; i <= n; i++) {
            int top = Integer.parseInt(st.nextToken());

            while(!s.isEmpty()) {
                if(s.peek()[1] >= top) {
                    System.out.print(s.peek()[0] + " ");
                    break;
                }

                s.pop();
            }

            if(s.isEmpty()) {
                System.out.print("0 ");
            }

            s.push(new int[] {i, top});
        }
    }
}