public class Main {
    public static int d(int num) {
        int sum = num;

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

    public static void main(String args[]) throws Exception {
        boolean[] flag = new boolean[10004];

        for(int i = 1; i <= 10000; i++) {
            int n = d(i);
            if(n < 10001) flag[n] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 10000; i++) {
            if(!flag[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}