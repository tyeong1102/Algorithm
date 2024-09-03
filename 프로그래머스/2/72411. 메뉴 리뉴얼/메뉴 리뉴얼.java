import java.util.*;

class Solution {
    public static HashMap<String, Integer> map;
    public static int[] max;
    public static boolean[] visited;
    static String menu;
    
    private static void go(int idx, int cnt, int j, int courseNum, String str) {
        if (cnt == courseNum) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
            
            max[j] = Math.max(max[j], map.get(str));
            
            return;
        }

        for (int i = idx; i < menu.length(); i++) {
            visited[i] = true;
            go(i + 1, cnt + 1, j, courseNum, str + menu.charAt(i));
        }
    }   

    public static String[] solution(String[] orders, int[] course) {
        
        ArrayList<String> answer = new ArrayList<String>();
 
        max = new int[course.length]; // 코스 음식 개수 중 최대
        map = new HashMap<String, Integer>();
        
        for (String order : orders) {
            char a[] = order.toCharArray();
            Arrays.sort(a);
            menu = String.copyValueOf(a);
           
            for (int j = 0; j < course.length; j++) {
                visited = new boolean[menu.length()];
                go(0, 0, j, course[j], "");
            }
        }
 
        for (String str : map.keySet()) {
            for (int i = 0; i < course.length; i++) {
                if (course[i] == str.length() && max[i] > 1 && map.get(str) == max[i]) {
                    answer.add(str);
                }
            }
        }
 
        Collections.sort(answer);
        
        return answer.toArray(new String[answer.size()]);
    }
}
