import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int decimal = 0;
        for (int i = 0; i < m; i++) {
            decimal = decimal * A + arr[i];
        }

        // 10진법 숫자를 B진법으로 변환
        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            stack.push(decimal % B);
            decimal /= B;
        }

        // 결과 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}