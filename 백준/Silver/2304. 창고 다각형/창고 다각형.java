import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int n, s, e, ret, tmp;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[1001];
        
        s = Integer.MAX_VALUE;
        e = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a] = b;

            s = Math.min(a, s);
            e = Math.max(a, e);
        }

        Stack<Integer> height = new Stack<>();

        tmp = arr[s];
        for (int i = s + 1; i <= e; i++) {
            if(arr[i] < tmp)  {
                height.push(i);
            } else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x] = tmp;
                }
                tmp = arr[i];
            }
        }

        height.clear();

        tmp = arr[e];
        for(int i = e - 1; i >= s; i--){
            if(arr[i] < tmp) {
                height.push(i);
            } else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x] = tmp;
                }
                tmp = arr[i];
            }
        }

        for (int i = s; i <= e; i++) {
            ret += arr[i];
        }


        System.out.print(ret);
    }
}