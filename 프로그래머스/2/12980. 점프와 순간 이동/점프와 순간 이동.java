// k칸 앞으로 점프, 현재까지 온 거리 * 2 순간이동
// 순간이동은 건전지 사용X, k칸 이동하면 건전지 k 소모 -> 순간이동 많이하는 것이 이득
// n만큼의 거리를 이동할 때 건전지 사용량 최소로	

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                ans += 1;
            }
            n /= 2;
        }

        return ans;
    }
}