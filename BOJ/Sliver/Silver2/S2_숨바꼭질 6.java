import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 처음에는 N+1의 배열을 만들어서 수빈이의 위치를 넣어주고, 오름차순으로 정렬하여 차이가 최소가 되는 값을 답으로 생각했었다.
 * 하지만 그러면 등차수열일 경우에만 해당하고, 아닐 경우에는 술래의 위치를 건너뛰는 문제가 발생하였다.
 * 최대 공약수를 사용하여 모두의 위치를 찾아갈 수 있도록 수정하였다.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]); // 참가할 인원
        int S = Integer.parseInt(input[1]); // 수빈이 위치

        int[] A = new int[N];
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Math.abs(Integer.parseInt(numbers[i]) - S); // 위치의 차이 절대값
        }

        // 최대공약수를 찾기 위한 초기값 설정
        int gcd = A[0];
        for (int i = 1; i < N; i++) {
            gcd = gcd(gcd, A[i]);
        }

        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}