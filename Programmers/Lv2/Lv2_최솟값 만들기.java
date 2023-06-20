import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int[] arr = new int[A.length];

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i] * B[A.length - 1 - i];
            answer += arr[i];
        }

        return answer;
    }
}