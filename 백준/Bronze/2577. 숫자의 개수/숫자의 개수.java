import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long a, b, c, mul;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        arr = new int[10];

        mul = a * b * c;

        while (mul > 0) {
            int tmp = (int) (mul % 10);
            arr[tmp]++;
            mul /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}