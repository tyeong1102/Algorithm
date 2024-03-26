import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int n, ret;
    public static boolean[] prime;
    public static List<Integer> list = new ArrayList<>();

    public static void isPrime(int n) {
        prime = new boolean[n + 1];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        isPrime(n);

        int s = 0;
        int e = 0;
        int sum = 2;

        while (s < list.size() && e < list.size()) {
            if(sum == n) {
                ret++;
                sum -= list.get(s);
                s++;
            } else if (sum > n) {
                sum -= list.get(s);
                s++;
            } else {
                e++;
                if(e >= list.size()) break;
                sum += list.get(e);
            }
        }

        System.out.println(ret);
    }
}