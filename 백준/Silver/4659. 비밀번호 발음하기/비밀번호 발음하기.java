import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static int mo, ja;
    public static boolean flag;
    public static String str;
    public static List<Character> list = List.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            str = br.readLine();

            mo = 0;

            if (str.equals("end")) {
                break;
            }

            flag = true;
            for (int i = 0; i < str.length(); i++) {
                if(list.contains(str.charAt(i))) {
                    mo++;
                }
            }

            for(int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    if (str.charAt(i) == 'e' || str.charAt(i) == 'o') {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            for (int i = 0; i <= str.length() - 3; i++) {
                int jNum = 0;
                int mNum = 0;
                for (int j = i; j < i + 3; j++) {
                    if (!list.contains(str.charAt(j))) {
                        jNum++;
                    } else {
                        mNum++;
                    }
                }

                if (jNum == 3 || mNum == 3) {
                    flag = false;
                }
            }

            if (mo == 0) {
                flag = false;
            }

            if (flag) {
                sb.append("<").append(str).append(">").append(" is acceptable.").append("\n");
            } else {
                sb.append("<").append(str).append(">").append(" is not acceptable.").append("\n");
            }
        }

        System.out.println(sb);
    }
}