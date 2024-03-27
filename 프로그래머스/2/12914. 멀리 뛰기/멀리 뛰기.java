class Solution {
    public static long[] dp;
    
    public long solution(int n) {
        long answer = 0;
        
        dp = new long[20001];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        answer = dp[n];
        
        return answer;
    }
}