import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static String[] arr;

    public String solution(int[] numbers) {
        String answer = "";

        arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        for (String s : arr) {
            answer += s;
        }
        
        return answer;
    }
}