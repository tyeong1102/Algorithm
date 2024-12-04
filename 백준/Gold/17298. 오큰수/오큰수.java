import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n, tmp;
    public static Integer[] arr;
    public static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {

            while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
                arr[s.pop()] = arr[i];
            }

            s.push(i);
        }

        while(!s.isEmpty()) {
            arr[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}