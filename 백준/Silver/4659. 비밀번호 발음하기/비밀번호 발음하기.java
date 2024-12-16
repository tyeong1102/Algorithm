import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
    public static int mo, mCnt, jCnt;
    public static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            mo = 0;
            mCnt = 0;
            jCnt = 0;

            flag = true;

            if (str.equals("end")) {
                break;
            }

            for(int i = 0; i < str.length(); i++) {
                if(list.contains(str.charAt(i))) {
                    mo++;
                    mCnt++;
                    jCnt = 0;
                } else {
                    jCnt++;
                    mCnt = 0;
                }

                if(mCnt == 3 || jCnt == 3) {
                    flag = false;
                }
            }

            if (mo == 0) {
                flag = false;
            }

            for(int i = 1; i < str.length(); i++) {
                if (str.charAt(i - 1) == str.charAt(i)) {
                    if (str.charAt(i) == 'e' || str.charAt(i) == 'o') {
                        continue;
                    } else {
                        flag = false;
                    }
                }
            }

            if (flag) {
                sb.append("<").append(str).append("> is acceptable.").append("\n");
            } else {
                sb.append("<").append(str).append("> is not acceptable.").append("\n");
            }

        }

        System.out.println(sb);
    }
}