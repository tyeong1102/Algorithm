import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = arr[0];

        if (tmp == 1) {
            for (int i = 1; i < 8; i++) {
                if (tmp + 1 == arr[i]) {
                    tmp++;
                } else {
                    System.out.println("mixed");
                    return;
                }
            }

            System.out.println("ascending");
        } else if (tmp == 8) {
            for (int i = 1; i < 8; i++) {
                if (tmp - 1 == arr[i]) {
                    tmp--;
                } else {
                    System.out.println("mixed");
                    return;
                }
            }

            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}