import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int x, y, z;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            if((x * x + y * y) == z * z) {
                sb.append("right").append('\n');
            }
            else if(x * x == (y * y + z * z)) {
                sb.append("right").append('\n');
            }
            else if(y * y == (z * z + x * x)) {
                sb.append("right").append('\n');
            }
            else {
                sb.append("wrong").append('\n');
            }
        }

        System.out.println(sb);

    }
}