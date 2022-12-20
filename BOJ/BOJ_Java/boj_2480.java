import java.util.Scanner;

public class boj_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int res;

        if(x == y && y == z) {
            res = 10000 + (x*1000);
            System.out.print(res);
        } else if(x == y || x == z){
            res = 1000 + (x*100);
            System.out.print(res);
        } else if(y == z) {
            res = 1000 + (y*100);
            System.out.print(res);
        } else {
            int max = Math.max(x, Math.max(y, z));
            res = max * 100;
            System.out.print(res);
        }
    }
}
