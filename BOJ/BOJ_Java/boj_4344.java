import java.util.Scanner;

public class boj_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i=0; i<c; i++){
            int num = sc.nextInt();
            int[] arr = new int[num];

            double sum = 0;
            double avg = 0;
            double cnt = 0;

            for(int j=0; j<num; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = sum / num;

            for(int j=0; j<num; j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (cnt / num)*100);
        }
    }
}
