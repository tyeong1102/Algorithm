import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        // 주차 시간
        Map<String, Integer> parking = new HashMap<>();
        // 들어온 시간
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < records.length; i++){
            String[] data = records[i].split(" ");
            
            if(data[2].equals("IN")){
                String[] time = data[0].split(":");
                int minute = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                map.put(data[1], minute);
            }else {
                String[] time = data[0].split(":");
                int end = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                int start = map.get(data[1]);
                parking.put(data[1], parking.getOrDefault(data[1], 0) + end - start);
                map.remove(data[1]);
            }
        }
        
        // 출차 기록이 없는 차
        for(String car : map.keySet()){
            String[] time = "23:59".split(":");
            int end = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            int start = map.get(car);
            parking.put(car, parking.getOrDefault(car, 0) + end - start);
        }
        
        List<String> cars = new ArrayList<>(parking.keySet());
        Collections.sort(cars);
        
        // 주차 요금을 계산
        int[] answer = new int[parking.size()];
        int idx = 0;
        
        for(String car : cars) {
            int time = parking.get(car);
            if(time <= fees[0]) {
                answer[idx++] = fees[1];
            } else {
                time -= fees[0];
                answer[idx++] = fees[1] + (int)Math.ceil((double)time / fees[2]) * fees[3];
            }
        }
        
        return answer;
    }
}
