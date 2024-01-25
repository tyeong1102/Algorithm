import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int ret;
    public static int[] bur;
    public static int[] bev;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bur = new int[3];
        bev = new int[2];

        for (int i = 0; i < 3; i++) {
            bur[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            bev[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bur);
        Arrays.sort(bev);

        ret = bur[0] + bev[0] - 50;

        System.out.println(ret);
    }
}