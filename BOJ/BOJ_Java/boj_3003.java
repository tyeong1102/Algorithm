import java.util.Scanner;

public class boj_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chess[] = {1, 1, 2, 2, 2, 8};
        int input[] = new int[6];

        for(int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
            int res = chess[i] - input[i];

            System.out.print(res + " ");
        }
    }
}
