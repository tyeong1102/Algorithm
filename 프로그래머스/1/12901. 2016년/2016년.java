class Solution {
    public static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    public static int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public String solution(int a, int b) {
        String answer = "";
        int cnt = 0;
        
        for(int i = 0; i < a; i++) {
            cnt += month[i];
        }
        
        cnt += b;
        
        answer = day[(cnt + 4) % 7];
        
        return answer;
    }
}