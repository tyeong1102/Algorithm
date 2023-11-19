import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		int n = 0;
        
        for(int i = 0; i < commands.length; i++) {
            int k = 0;
            
            int a = commands[i][0];
            int b = commands[i][1];
                                  
			int[] list = new int[b - a + 1]; 
                                     
			for (int j = a; j <= b; j++) { 
				list[k++] = array[j - 1]; 
			}
            
			Arrays.sort(list); 
            
			answer[n++] = list[commands[i][2] - 1]; 
        }
        
        return answer;
    }
}