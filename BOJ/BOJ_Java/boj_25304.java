import java.util.Scanner;

public class boj_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int total = sc.nextInt();
        int buy = sc.nextInt();

        for(int i=0; i<buy; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();

            sum += price*num;
        }

        if(total == sum){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}
