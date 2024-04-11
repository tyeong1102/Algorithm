import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, w, l, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        arr = new int[n];

        Queue<Integer> truck = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }

        int weight = 0;

        while (!bridge.isEmpty()) {
            ret++;
            weight -= bridge.poll();

            if (!truck.isEmpty()) {
                if (truck.peek() + weight <= l) {
                    weight += truck.peek();
                    bridge.add(truck.poll());
                } else {
                    bridge.add(0);
                }
            }
        }

        System.out.println(ret);



    }
}