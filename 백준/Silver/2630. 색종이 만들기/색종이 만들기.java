import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, w, b;
    public static int[][] arr;

    public static boolean colorCheck(int row, int col, int size) {

        int color = arr[row][col];	// 첫 번째 원소를 기준으로 검사

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void cut(int row, int col, int size) {
        if(colorCheck(row, col, size)) {
            if(arr[row][col] == 0) {
                w++;
            }
            else {
                b++;
            }
            return;
        }

        int half = size / 2;	// 절반 사이즈
        // 재귀 호출
        cut(row, col, half);						// 2사분면
        cut(row, col + half, half);				// 1사분면
        cut(row + half, col, half);				// 3사분면
        cut(row + half, col + half, half);	// 4사분면
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cut(0, 0, n);

        System.out.println(w);
        System.out.println(b);
    }
}