import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        sb.append(" ");
                    } else {
                        sb.append("*");
                    }
                }
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}