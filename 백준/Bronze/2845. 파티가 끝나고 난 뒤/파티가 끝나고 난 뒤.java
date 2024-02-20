
import java.io.*;
import java.util.*;
public class Main {
    public static int l, p;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        l = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        int num = l * p;
        
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(n - num + " ");
        }
        
        System.out.print(sb);
    }
}