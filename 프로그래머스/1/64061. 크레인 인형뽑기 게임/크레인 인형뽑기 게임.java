// stack
// 오른쪽 바구니에 똑같은 인형 2개가 쌓이면 둘 다 사라짐
// 인형이 없는 열에서 작동시키면 아무 반응 없음
// 터져서 사라진 인형의 개수를 return

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> s = new Stack<>();
        
        int n = board.length;
        
        for(int i = 0; i < moves.length; i++) {
            int row = moves[i] - 1;
            
            for(int j = 0; j < n; j++) {
                if(board[j][row] == 0) {
                    continue;
                } else {
                    if(!s.isEmpty() && s.peek() == board[j][row]) {
                        s.pop();
                        board[j][row] = 0;
                        answer += 2;
                        break;
                    } else {
                        s.push(board[j][row]);
                        board[j][row] = 0;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}