import java.util.*;

class Solution {
    
    private String replace(String m) {
        return m.replaceAll("C#", "c")
                     .replaceAll("D#", "d")
                     .replaceAll("F#", "f")
                     .replaceAll("G#", "g")
                     .replaceAll("A#", "a")
                        .replaceAll("B#", "b");
    }
    
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int longTime = 0; 
        
        m = replace(m);
        
        for (String info : musicinfos) {
            String[] parts = info.split(",");
            
            String startTime = parts[0];
            String endTime = parts[1];
            String title = parts[2];
            String sheet = replace(parts[3]);
            
        
            String[] start = startTime.split(":");
            String[] end = endTime.split(":");
            
            int startHour = Integer.parseInt(start[0]);
            int startMinute = Integer.parseInt(start[1]);
            
            int endHour = Integer.parseInt(end[0]);
            int endMinute = Integer.parseInt(end[1]);
            
            int playTime = (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
            
            StringBuilder playedMusic = new StringBuilder();
            
            for (int i = 0; i < playTime; i++) {
                playedMusic.append(sheet.charAt(i % sheet.length()));
            }
            
            if (playedMusic.toString().contains(m)) {

                if (playTime > longTime) {
                    longTime = playTime;
                    answer = title;
                }
            }
        }
        
        return answer;
    }
}
