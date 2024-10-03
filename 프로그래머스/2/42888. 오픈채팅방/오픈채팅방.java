// 닉네임 변경 법
//  - 나가서 변경하고 다시 입장
//  - 방에서 변경
// 이름엔 중복이 허용되지만, 동일한 이름 간에 구분이 필요함 -> map

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap<String, String> userMap = new HashMap<>();
        List<String> messages = new ArrayList<>();
        
        for (String rec : record) {
            String[] parts = rec.split(" ");
            String command = parts[0];
            String userId = parts[1];

            if (command.equals("Enter")) {
                String nickname = parts[2];
                userMap.put(userId, nickname);
                messages.add(userId + "님이 들어왔습니다.");
                
            } else if (command.equals("Leave")) {
                messages.add(userId + "님이 나갔습니다.");
                
            } else if (command.equals("Change")) {
                String newNickname = parts[2];
                userMap.put(userId, newNickname);
            }
        }
        
        String[] answer = new String[messages.size()];
        
        for (int i = 0; i < messages.size(); i++) {
            String[] messageParts = messages.get(i).split("님");
            String userId = messageParts[0];
            answer[i] = userMap.get(userId) + "님" + messageParts[1];
        }
        
        return answer;
    }
}
