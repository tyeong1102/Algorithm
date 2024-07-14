import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n;

    public static class PlaceTime implements Comparable<PlaceTime> {
        String place;
        int start;

        PlaceTime(String place, int start) {
            this.place = place;
            this.start = start;
        }

        @Override
        public int compareTo(PlaceTime o) {
            if (!this.place.equals(o.place)) {
                return this.place.compareTo(o.place);
            }
            return Integer.compare(this.start, o.start);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        HashMap<String, int[]> map = new HashMap<>();
        HashSet<String> nameSet = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String place = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (nameSet.contains(name)) continue;
            nameSet.add(name);
            
            int[] counts = map.computeIfAbsent(place, k -> new int[50001]);
            for (int idx = s; idx < e; idx++) {
                counts[idx]++;
                max = Math.max(max, counts[idx]);
            }
        }

        List<PlaceTime> haveMax_List = new ArrayList<>();
        for (String place : map.keySet()) {
            int[] counts = map.get(place);
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] == max) {
                    haveMax_List.add(new PlaceTime(place, i));
                    break;
                }
            }
        }

        Collections.sort(haveMax_List);
        PlaceTime now_Place = haveMax_List.get(0);
        int end = (findEnd(map.get(now_Place.place), now_Place.start, max));
        System.out.println(now_Place.place + " " + now_Place.start + " " + end);
    }

    private static int findEnd(int[] counts, int start, int max) {
        int end = start;
        while (end < counts.length && counts[end] == max) {
            end++;
        }
        return end;
    }
}