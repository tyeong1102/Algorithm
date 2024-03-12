class Solution {
    
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n; i++) {  
            int sum = 0;
            int s = i;
            
            while(sum < n) sum += s++;
            
            if(sum == n) answer++;
        }
        
        return answer;
    }
}