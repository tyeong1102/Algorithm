import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int t, x1, y1, r1, x2, y2, r2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            sb.append(tangent_point(x1, y1, r1, x2, y2, r2)).append('\n');
        }
        System.out.println(sb);

    }
    
    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {

        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if(distance_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if(distance_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if(distance_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        } else if(distance_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }

    }

}