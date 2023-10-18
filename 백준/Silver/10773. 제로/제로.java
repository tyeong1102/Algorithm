import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();

        int sum = 0;
        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0 && !s.empty()) s.pop();
            else s.push(n);
        }

        while(!s.empty()) {
            sum += s.peek();
            s.pop();
        }

        System.out.println(sum);
    }
}