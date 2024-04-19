import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star = new String[N];
        
        star[0] = "  *  ";
        star[1] = " * * ";
        star[2] = "*****";

        for (int i = 1; 3 * Math.pow(2, i) <= N; i++) {
            writeStar(i);
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(star[i] + "\n");
        }
    }
   
    static void writeStar(int i) {
        int bottom = (int) (3 * Math.pow(2, i));
        int middle = bottom / 2;
        
        for (int j = middle; j < bottom; j++) {
            star[j] = star[j - middle] + " " + star[j - middle];
        }
        
        String blank = " ".repeat(middle);
       
        for (int j = 0; j < middle; j++) {
            star[j] = blank + star[j] + blank;
        }
    }
}